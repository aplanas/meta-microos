SUMMARY = "The Exim Mail Transfer Agent, a Replacement for sendmail"
DESCRIPTION = "Exim is a mail transport agent (MTA) developed at the University of \
Cambridge for use on Unix systems connected to the Internet. It is \
freely available under the terms of the GNU General Public Licence. In \
style, it is similar to Smail 3, but its facilities are more extensive. \
In particular, it has options for verifying incoming sender and \
recipient addresses, for refusing mail from specified hosts, networks, \
or senders, and for controlling mail relaying."
LICENSE = "GPL-2.0-or-later"

PV = "4.96"

RPM_NAME = "exim-4.96-5.3.aarch64.rpm"
RPM_HASH = "6c4b45c5db1c317e763b82dcad471aab399fa5680f37c78e90df748b0fad0b9da33c7dbb15a7998b7182deb67d0709ad476737f92b94e0636522a45cf63eaa6a"

RPROVIDES:${PN} += "config-exim \
exim \
smtp-daemon"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
fileutils \
fillup \
group-mail \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libdb-4.8.so \
liblber.so.2 \
libldap.so.2 \
libm.so.6 \
libmariadb.so.3 \
libpam.so.0 \
libpcre2-8.so.0 \
libpq.so.5 \
libsasl2.so.3 \
libspf2.so.2 \
libsqlite3.so.0 \
libssl.so.3 \
logrotate \
permissions \
systemd \
textutils \
user-mail"

inherit rpm
