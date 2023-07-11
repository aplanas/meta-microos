SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "12.3.0+git1204"

RPM_NAME = "libgdruntime3-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "547b6af3231743be98c93d144772b305d6358fc51da899b3015c9349ef5f6bb2ed70943ee83c4eba2f54ca6bf462a85fd6cc3759860dd6ee1c1132c07d1fdd59"

RPROVIDES:${PN} += "libgdruntime.so.3 \
libgdruntime3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
