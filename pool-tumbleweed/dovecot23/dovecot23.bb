SUMMARY = "IMAP and POP3 Server Written Primarily with Security in Mind"
DESCRIPTION = "Dovecot is an IMAP and POP3 server for Linux and UNIX-like systems, \
written primarily with security in mind. Although it is written in C, \
it uses several coding techniques to avoid most of the common pitfalls. \
 \
Dovecot can work with standard mbox and maildir formats and is fully \
compatible with UW-IMAP and Courier IMAP servers as well as mail \
clients accessing the mailboxes directly."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & MIT"

PV = "2.3.20"

RPM_NAME = "dovecot23-2.3.20-3.2.aarch64.rpm"
RPM_HASH = "3f6261ab3580a5e99af45d1ea277f117af2529d45e259224a449af3d83c73ca3659a6cf7732a67a10cdf9243ed807eb34d53d4dd1e2439533a97c3b1ff428013"

RPROVIDES:${PN} += "config-dovecot23 \
dovecot-implementation \
dovecot23 \
lib01-acl-plugin.so \
lib01-apparmor-plugin.so \
lib01-mail-lua-plugin.so \
lib02-imap-acl-plugin.so \
lib02-lazy-expunge-plugin.so \
lib05-mail-crypt-acl-plugin.so \
lib05-pop3-migration-plugin.so \
lib10-doveadm-acl-plugin.so \
lib10-doveadm-quota-plugin.so \
lib10-doveadm-sieve-plugin.so \
lib10-last-login-plugin.so \
lib10-mail-crypt-plugin.so \
lib10-quota-plugin.so \
lib10-sieve-storage-ldap-plugin.so \
lib11-imap-quota-plugin.so \
lib11-trash-plugin.so \
lib15-notify-plugin.so \
lib20-auth-var-expand-crypt.so \
lib20-charset-alias-plugin.so \
lib20-listescape-plugin.so \
lib20-mail-log-plugin.so \
lib20-mailbox-alias-plugin.so \
lib20-notify-status-plugin.so \
lib20-push-notification-plugin.so \
lib20-quota-clone-plugin.so \
lib20-replication-plugin.so \
lib20-var-expand-crypt.so \
lib20-virtual-plugin.so \
lib20-zlib-plugin.so \
lib22-push-notification-lua-plugin.so \
lib30-imap-zlib-plugin.so \
lib90-old-stats-plugin.so \
lib90-sieve-extprograms-plugin.so \
lib90-sieve-imapsieve-plugin.so \
lib90-sieve-plugin.so \
lib95-imap-filter-sieve-plugin.so \
lib95-imap-old-stats-plugin.so \
lib95-imap-sieve-plugin.so \
lib99-welcome-plugin.so \
libauthdb-imap.so \
libauthdb-ldap.so \
libauthdb-lua.so \
libdcrypt-openssl.so \
libdict-ldap.so \
libdoveadm-mail-crypt-plugin.so \
libdovecot-compression.so.0 \
libdovecot-dsync.so.0 \
libdovecot-fts.so.0 \
libdovecot-lda.so.0 \
libdovecot-ldap.so.0 \
libdovecot-login.so.0 \
libdovecot-lua.so.0 \
libdovecot-sieve.so.0 \
libdovecot-sql.so.0 \
libdovecot-storage-lua.so.0 \
libdovecot-storage.so.0 \
libdovecot.so.0 \
libfs-compress.so \
libfs-crypt.so \
libfs-mail-crypt.so \
libmanagesieve-login-settings.so \
libmanagesieve-settings.so \
libmech-gssapi.so \
libold-stats-mail.so \
libpigeonhole-settings.so \
libssl-iostream-openssl.so \
libstats-auth.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/env \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dovecot \
fillup \
ld-linux-aarch64.so.1 \
libapparmor.so.1 \
libbz2.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypt.so.1 \
libcrypto.so.3 \
libgssapi-krb5.so.2 \
libicui18n.so.73 \
libicuuc.so.73 \
libkrb5.so.3 \
liblber.so.2 \
libldap.so.2 \
liblua5.3.so.5 \
liblz4.so.1 \
liblzma.so.5 \
libm.so.6 \
libpam.so.0 \
libsodium.so.23 \
libssl.so.3 \
libwrap.so.0 \
libz.so.1 \
libzstd.so.1"

inherit rpm
