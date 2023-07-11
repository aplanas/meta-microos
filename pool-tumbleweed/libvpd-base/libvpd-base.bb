SUMMARY = "Udev rules for VPD Database access library"
DESCRIPTION = "Udev rules for libvpd library used to access a vpd database created by \
vpdupdate in the lsvpd package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.9"

RPM_NAME = "libvpd-base-2.2.9-3.4.aarch64.rpm"
RPM_HASH = "7644296b3467d87298cd489a84eac740052b15a7b1fa7de3b806b57d591cb606ea0bcf4158db1f4114e5617a3a517964db4f6c43bd2e9341b982fb117a811791"

RPROVIDES:${PN} += "libvpd-base"

RDEPENDS:${PN} += ""

inherit rpm
