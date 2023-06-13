SUMMARY = "Windows guest support in libguestfs"
DESCRIPTION = "Provides the needed pieces for libguestfs to handle Windows guests."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-winsupport-1.50.1-3.1.aarch64.rpm"
RPM_HASH = "7ce0290d3b5e0557a4bfcf3b6663d5f46a375fa71e973865c27c36c5c633ce0b2073e206560e8e25d2e303bbd184dd6f3e606a53da6d2ab6e051d3f8671d291a"

RPROVIDES:${PN} += "guestfs-winsupport \
libguestfs-winsupport \
libguestfs-winsupport(aarch-64)"

RDEPENDS:${PN} += "libguestfs"

inherit rpm
