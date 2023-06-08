SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-x86_64-gcc11-icecream-backend-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "c8de1700794d594f6042f8c9050c0375c2a69ca8e3d6e9d0e4bd88a965fe28e100f0ddc1688f52db4dceccee7651c63bd25ff088256d861560f9113547aa07b3"

RPROVIDES:${PN} += "cross-x86_64-gcc11-icecream-backend cross-x86_64-gcc11-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
