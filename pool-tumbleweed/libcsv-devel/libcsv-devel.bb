SUMMARY = "Development files for libcsv"
DESCRIPTION = "This package includes development files for libcsv."
LICENSE = "LGPL-2.1+"

PV = "3.0.3"

RPM_NAME = "libcsv-devel-3.0.3-2.25.aarch64.rpm"
RPM_HASH = "71f6d0d39d0be9034f73661d9c7e167728a8db696acf127cd8916f0764177410bd0b0578672c03a2f5a243a63c763af1567a77895222108d19759022e3b8435a"

RPROVIDES:${PN} += "libcsv-devel"

RDEPENDS:${PN} += "libcsv3"

inherit rpm
