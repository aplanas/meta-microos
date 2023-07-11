SUMMARY = "BSD Sendmail"
DESCRIPTION = "The 'Unix System Administration Handbook' calls sendmail 'The most \
complex and complete mail delivery system in common use...' . \
 \
Ready-made configuration files are included for systems connected by \
TCP/IP (with or without a name server) and for systems using UUCP. \
 \
'procmail' is used as a local mail agent. \
 \
'sendmail' is a trademark of Sendmail, Inc."
LICENSE = "Sendmail"

PV = "8.17.2"

RPM_NAME = "sendmail-8.17.2-1.1.aarch64.rpm"
RPM_HASH = "93a6e738404e1766d524660accfb1378efe3d7a93cba17dbe7b30d02a0085717fe003b071c729fb1b009a45b980c01c8e08d0c8defc205cc9b3162810a744e54"

RPROVIDES:${PN} += "config-sendmail \
sendcf \
sendmail \
sendmail-tls \
smailcfg \
smtp-daemon"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/fuser \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
coreutils \
filesystem \
fillup \
findutils \
group-daemon \
group-mail \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libdb-4.8.so \
libicuuc.so.73 \
liblber.so.2 \
libldap.so.2 \
libnss-usrfiles2 \
libsasl2.so.3 \
libssl.so.3 \
libwrap.so.0 \
m4 \
make \
netcfg \
permissions \
procmail \
sed \
user-daemon \
user-mail"

inherit rpm
