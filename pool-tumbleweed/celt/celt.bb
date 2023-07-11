SUMMARY = "Ultra-Low Delay Audio Codec"
DESCRIPTION = "The CELT codec is an experimental audio codec for use in low-delay \
speech and audio communication."
LICENSE = "BSD-2-Clause"

PV = "0.11.3"

RPM_NAME = "celt-0.11.3-1.29.aarch64.rpm"
RPM_HASH = "79b337f6743e8dbf804a0fbfd997abb986b9cd74c3e76bd8b08d88c9c11016b78aa856ee6375306a1ac4034a15e66bc933d7b384b0c1b864b6fb4d8203deddad"

RPROVIDES:${PN} += "celt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcelt0-2 \
libcelt0.so.2 \
libogg.so.0"

inherit rpm
