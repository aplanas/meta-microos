SUMMARY = "Library to access the Windows Shell Item format"
DESCRIPTION = "Library to access the Windows Shell Item format for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "LGPL-3.0-or-later"

PV = "20230710"

RPM_NAME = "libfwsi1-20230710-2.1.aarch64.rpm"
RPM_HASH = "464f1b916122478dc65c727443afb41caf22b9e168274123e257f8cd88c930d45fd380bde745b3e74626017013854f75f9092bc61ffc2a35b6e840f2739ae780"

RPROVIDES:${PN} += "libfwsi.so.1 \
libfwsi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcnotify.so.1 \
libuna.so.1"

inherit rpm
