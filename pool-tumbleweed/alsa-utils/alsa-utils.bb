SUMMARY = "Advanced Linux Sound Architecture Utilities"
DESCRIPTION = "This package contains utility programs supporting ALSA, Advanced Linux \
Sound Architecture."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.9"

RPM_NAME = "alsa-utils-1.2.9-1.1.aarch64.rpm"
RPM_HASH = "c0d52cee2e800bed983ca42cc6eed82695fb37bcf5b64cac260d608b7d1754fdc52abc55375c6ca438d932df40032e44a85470c930d1f764a82f49c63b0f3bc1"

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
