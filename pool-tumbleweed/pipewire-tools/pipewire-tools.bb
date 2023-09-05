SUMMARY = "The PipeWire Tools"
DESCRIPTION = "This package contains command line utilities for the PipeWire media server."
LICENSE = "MIT"

PV = "0.3.79"

RPM_NAME = "pipewire-tools-0.3.79-1.2.aarch64.rpm"
RPM_HASH = "c3f0adb38c07f21d82eea21dbc940071f97a088f018f04ccf8d24ca379deef9e2ac5f218e231c2743b4829322021ead477b500585a8bf20b3285017c369873f3"

RPROVIDES:${PN} += "pipewire-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libm.so.6 \
libncursesw.so.6 \
libpipewire-0.3.so.0 \
libreadline.so.8 \
libsndfile.so.1 \
libtinfo.so.6"

inherit rpm
