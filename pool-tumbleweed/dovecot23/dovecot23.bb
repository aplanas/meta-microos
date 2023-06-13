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

RPROVIDES:${PN} += "config(dovecot23) \
dovecot-implementation \
dovecot23 \
dovecot23(aarch-64) \
lib01_acl_plugin.so()(64bit) \
lib01_apparmor_plugin.so()(64bit) \
lib01_mail_lua_plugin.so()(64bit) \
lib02_imap_acl_plugin.so()(64bit) \
lib02_lazy_expunge_plugin.so()(64bit) \
lib05_mail_crypt_acl_plugin.so()(64bit) \
lib05_pop3_migration_plugin.so()(64bit) \
lib10_doveadm_acl_plugin.so()(64bit) \
lib10_doveadm_quota_plugin.so()(64bit) \
lib10_doveadm_sieve_plugin.so()(64bit) \
lib10_last_login_plugin.so()(64bit) \
lib10_mail_crypt_plugin.so()(64bit) \
lib10_quota_plugin.so()(64bit) \
lib10_sieve_storage_ldap_plugin.so()(64bit) \
lib11_imap_quota_plugin.so()(64bit) \
lib11_trash_plugin.so()(64bit) \
lib15_notify_plugin.so()(64bit) \
lib20_auth_var_expand_crypt.so()(64bit) \
lib20_charset_alias_plugin.so()(64bit) \
lib20_listescape_plugin.so()(64bit) \
lib20_mail_log_plugin.so()(64bit) \
lib20_mailbox_alias_plugin.so()(64bit) \
lib20_notify_status_plugin.so()(64bit) \
lib20_push_notification_plugin.so()(64bit) \
lib20_quota_clone_plugin.so()(64bit) \
lib20_replication_plugin.so()(64bit) \
lib20_var_expand_crypt.so()(64bit) \
lib20_virtual_plugin.so()(64bit) \
lib20_zlib_plugin.so()(64bit) \
lib22_push_notification_lua_plugin.so()(64bit) \
lib30_imap_zlib_plugin.so()(64bit) \
lib90_old_stats_plugin.so()(64bit) \
lib90_sieve_extprograms_plugin.so()(64bit) \
lib90_sieve_imapsieve_plugin.so()(64bit) \
lib90_sieve_plugin.so()(64bit) \
lib95_imap_filter_sieve_plugin.so()(64bit) \
lib95_imap_old_stats_plugin.so()(64bit) \
lib95_imap_sieve_plugin.so()(64bit) \
lib99_welcome_plugin.so()(64bit) \
libauthdb_imap.so()(64bit) \
libauthdb_ldap.so()(64bit) \
libauthdb_lua.so()(64bit) \
libdcrypt_openssl.so()(64bit) \
libdict_ldap.so()(64bit) \
libdoveadm_mail_crypt_plugin.so()(64bit) \
libdovecot-compression.so.0()(64bit) \
libdovecot-dsync.so.0()(64bit) \
libdovecot-fts.so.0()(64bit) \
libdovecot-lda.so.0()(64bit) \
libdovecot-ldap.so.0()(64bit) \
libdovecot-login.so.0()(64bit) \
libdovecot-lua.so.0()(64bit) \
libdovecot-sieve.so.0()(64bit) \
libdovecot-sql.so.0()(64bit) \
libdovecot-storage-lua.so.0()(64bit) \
libdovecot-storage.so.0()(64bit) \
libdovecot.so.0()(64bit) \
libfs_compress.so()(64bit) \
libfs_crypt.so()(64bit) \
libfs_mail_crypt.so()(64bit) \
libmanagesieve_login_settings.so()(64bit) \
libmanagesieve_settings.so()(64bit) \
libmech_gssapi.so()(64bit) \
libold_stats_mail.so()(64bit) \
libpigeonhole_settings.so()(64bit) \
libssl_iostream_openssl.so()(64bit) \
libstats_auth.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
/usr/bin/env \
/usr/bin/mkdir \
/usr/bin/touch \
dovecot \
fillup \
ld-linux-aarch64.so.1()(64bit) \
libapparmor.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libcap.so.2()(64bit) \
libcrypt.so.1()(64bit) \
libcrypto.so.3()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
liblber.so.2()(64bit) \
libldap.so.2()(64bit) \
liblua5.3.so.5()(64bit) \
liblz4.so.1()(64bit) \
liblzma.so.5()(64bit) \
libm.so.6()(64bit) \
libpam.so.0()(64bit) \
libsodium.so.23()(64bit) \
libssl.so.3()(64bit) \
libwrap.so.0()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
