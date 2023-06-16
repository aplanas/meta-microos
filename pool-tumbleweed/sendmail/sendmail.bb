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

PV = "8.17.1"

RPM_NAME = "sendmail-8.17.1-9.1.aarch64.rpm"
RPM_HASH = "35943d352b6adf25f2661355563e46fcc60a665c314bef8c46ecf6b7bdeb302e9b0573b916a43a5ac25c090166988ff29ac1d8d31c5457061d1c752c4d2f4b71"

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
