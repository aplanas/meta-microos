SUMMARY = "Library for MacOS data types"
DESCRIPTION = "libfmos is a library for MacOS data types."
LICENSE = "LGPL-3.0-or-later"

PV = "20230707"

RPM_NAME = "libfmos1-20230707-2.1.aarch64.rpm"
RPM_HASH = "ce954384e030d1b0ee5520b9a73f9777c54cdd4ad4ad7c17fe127a6330e9b1c9d4834b41bf8b0ae7db56fa8125ff551772b7e04645a28be80a0c44b1a2b08636"

RPROVIDES:${PN} += "libfmos.so.1 \
libfmos1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcnotify.so.1"

inherit rpm
