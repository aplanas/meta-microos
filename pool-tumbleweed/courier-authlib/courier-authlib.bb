SUMMARY = "Courier authentication library"
DESCRIPTION = "The Courier authentication library provides authentication services for \
other Courier applications."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "0.72.0"

RPM_NAME = "courier-authlib-0.72.0-1.5.aarch64.rpm"
RPM_HASH = "ce0a9421fc48a121a0068f5f2c2cdd9197f5fea7fe73a64fba9af9fe916dadd389d696ae080be0e7d3065427cb0c32d4e7375b2b9a36af8f34fee02c272290f9"

RPROVIDES:${PN} += "config-courier-authlib \
courier-authlib \
libauthcustom.so.0 \
libauthpam.so.0 \
libcourierauth.so.0 \
libcourierauthcommon.so.0 \
libcourierauthsasl.so.0 \
libcourierauthsaslclient.so.0"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/expect \
/usr/bin/perl \
/usr/bin/sh \
group-mail \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libgcc-s.so.1 \
libgdbm.so.6 \
libltdl.so.7 \
libpam.so.0 \
libstdc++.so.6 \
systemd"

inherit rpm
