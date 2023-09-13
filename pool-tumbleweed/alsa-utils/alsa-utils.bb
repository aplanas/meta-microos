SUMMARY = "Advanced Linux Sound Architecture Utilities"
DESCRIPTION = "This package contains utility programs supporting ALSA, Advanced Linux \
Sound Architecture."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.10"

RPM_NAME = "alsa-utils-1.2.10-1.1.aarch64.rpm"
RPM_HASH = "5bc0843af9758921e1eee3804559dd89876e31521c398af5cea4c08abfbe8f543bae5cf97cb99cca408824318d761607dcecdf41b3f3fa87d062a58e0eb693e7"

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
