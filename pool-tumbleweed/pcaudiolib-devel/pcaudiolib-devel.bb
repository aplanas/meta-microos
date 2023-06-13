SUMMARY = "Development files for libpcaudio0"
DESCRIPTION = "The Portable C Audio Library (pcaudiolib) provides a C API to different audio devices."
LICENSE = "GPL-3.0-or-later"

PV = "1.2"

RPM_NAME = "pcaudiolib-devel-1.2-1.5.aarch64.rpm"
RPM_HASH = "74cb59443769d1dd56b9196f7531aaee9177d5697c36529f3ace0f19c8c9da8415cac45b6c0161f504d51386d818761c121a81c0c70ca0dcfd59ab3fd8c19668"

RPROVIDES:${PN} += "pcaudiolib-devel \
pcaudiolib-devel(aarch-64)"

RDEPENDS:${PN} += "libpcaudio0"

inherit rpm
