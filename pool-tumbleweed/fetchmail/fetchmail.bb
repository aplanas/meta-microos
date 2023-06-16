SUMMARY = "Full-Featured POP and IMAP Mail Retrieval Daemon"
DESCRIPTION = "Fetchmail is a robust and well-documented remote mail retrieval and \
forwarding utility intended to be used over on-demand TCP/IP links \
(such as SLIP or PPP connections). \
 \
Fetchmail retrieves mail from remote mail servers and forwards it to \
your local machine's delivery system, so it can be read by normal mail \
user agents, such as mutt, elm, pine, (x)emacs/gnus, or mailx. \
 \
fetchmailconf, an interactive GUI configurator suitable for end-users, \
is included in the fetchmailconf package."
LICENSE = "GPL-2.0-or-later"

PV = "6.4.37"

RPM_NAME = "fetchmail-6.4.37-1.3.aarch64.rpm"
RPM_HASH = "3bff2a837ddff8feac797ef2454783b9643f1b45295a7c59c2b5b0cc3b5a2994ddb39be00b561efb256c2bdb6bf3e8679775a9fba416ee6d4849553af51a2820"

RPROVIDES:${PN} += "config-fetchmail \
fetchmail \
group-fetchmail \
user-fetchmail"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libcrypto.so.3 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
libssl.so.3 \
logrotate \
sysuser-shadow"

inherit rpm
