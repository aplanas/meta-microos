SUMMARY = "oneAPI Video Processing Library (oneVPL) dispatcher, tools, and examples"
DESCRIPTION = "The oneAPI Video Processing Library (oneVPL) provides a single video processing \
API for encode, decode, and video processing that works across a wide range of \
accelerators."
LICENSE = "MIT"

PV = "2023.2.0"

RPM_NAME = "libvpl-2023.2.0-1.2.aarch64.rpm"
RPM_HASH = "62aba486f5d4238c340380f69160a6445d6a6475e3d2ded31742cf1f7614f3e41fc98d413d0b6ef981bb248c52a02444ba056b29e459413e89c7956c153eb93c"

RPROVIDES:${PN} += "libvpl"

RDEPENDS:${PN} += ""

inherit rpm
