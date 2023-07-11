SUMMARY = "Go compiled shared library libstd.so"
DESCRIPTION = "Go standard library compiled to a dynamically loadable shared object libstd.so"
LICENSE = "BSD-3-Clause"

PV = "1.17.13"

RPM_NAME = "go1.17-libstd-1.17.13-5.2.aarch64.rpm"
RPM_HASH = "c9f543ac7526cccdf29466d5aa03ed8ddf73ecfbfcd906f1169abdb8d3f1b8d14e3e9f41c51d1679cc9e1aee0c0ec0b20a43f4ca0dada26a55f5404a1a68f7bd"

RPROVIDES:${PN} += "go-libstd \
go1.17-libstd \
libstd.so"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
