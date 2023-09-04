SUMMARY = "Windows guest support in libguestfs"
DESCRIPTION = "Provides the needed pieces for libguestfs to handle Windows guests."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-winsupport-1.50.1-4.2.aarch64.rpm"
RPM_HASH = "9396f84c793221b7c58402144067c225f2cedd4cc4e616703353c43b0a7f18ffde739a4047fe6a87444ef4a6b3e2e670baf3ad90e94be63e2f8ae343a15fc465"

RPROVIDES:${PN} += "guestfs-winsupport \
libguestfs-winsupport"

RDEPENDS:${PN} += "libguestfs"

inherit rpm
