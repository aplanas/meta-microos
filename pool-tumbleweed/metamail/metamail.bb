SUMMARY = "MIME Mail Handler"
DESCRIPTION = "Metamail is required for reading multimedia mail messages (such as \
those using the Andrew toolkit) with elm."
LICENSE = "GPL-2.0-only & MIT"

PV = "2.7.19"

RPM_NAME = "metamail-2.7.19-1274.5.aarch64.rpm"
RPM_HASH = "30dc970b4d89404801ff3a8c044bb38d8909e154a15ef0b00dbf017a0748c909cb56799a9a6db91732a3835a897ee99ebba55712e7098de80576666ac758273a"

RPROVIDES:${PN} += "metamail"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpipeline.so.1 \
libtinfo.so.6 \
sharutils"

inherit rpm
