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

RPM_NAME = "fetchmail-6.4.37-1.5.aarch64.rpm"
RPM_HASH = "132d1eae6764f7332f7e6417f0d290683423a7c72e1c6040f0391dce7064f111cb69ff09b25aa3865df0ee6f812c5f08b7554dda7f398fc25324b8cf4dabac88"

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
