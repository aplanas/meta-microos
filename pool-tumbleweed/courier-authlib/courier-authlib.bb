SUMMARY = "Courier authentication library"
DESCRIPTION = "The Courier authentication library provides authentication services for \
other Courier applications."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "0.72.0"

RPM_NAME = "courier-authlib-0.72.0-1.4.aarch64.rpm"
RPM_HASH = "31aa7ae4c90007b3d270ef7b0e72f4de9bf95f0defd3f3a3b03aac1f712bb36f47abebece64a3362a31893e3fd877a321e284b94d418e94b8da6136de01db99d"

RPROVIDES:${PN} += "config-courier-authlib \
courier-authlib \
libauthcustom.so.0 \
libauthpam.so.0 \
libcourierauth.so.0 \
libcourierauthcommon.so.0 \
libcourierauthsasl.so.0 \
libcourierauthsaslclient.so.0"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
/usr/bin/expect \
/usr/bin/perl \
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
