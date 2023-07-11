SUMMARY = "Advanced Linux Sound Architecture Utilities"
DESCRIPTION = "This package contains utility programs supporting ALSA, Advanced Linux \
Sound Architecture."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.9"

RPM_NAME = "alsa-utils-1.2.9-1.2.aarch64.rpm"
RPM_HASH = "dc8442b90a24c89c508cd13196f11c5b6840c397c3189a73cf309a9ae011317a7890b5a9801907e1f682c860f93a608df7e7bfd8fbe92e160c12e8437b2d73be"

RPROVIDES:${PN} += "alsa-utils \
libalsatplg-module-nhlt.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
alsa \
dialog \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libatopology.so.2 \
libc.so.6 \
libformw.so.6 \
libm.so.6 \
libmenuw.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libsamplerate.so.0 \
libtinfo.so.6 \
pciutils"

inherit rpm
