SUMMARY = "SUSE on Windows application"
DESCRIPTION = "Windows Store application providing SLES or openSUSE."
LICENSE = "MIT"

PV = "1"

RPM_NAME = "wsl-appx-1-13.640.aarch64.rpm"
RPM_HASH = "8aaf90b1eac3823ddca849eb36c1f42972aaf1e0cf83afa9821749c99ec211f976b07184c07e5bd6badc5776a7cfea18c46b095cadb5253468f9859e5ed98aab"

RPROVIDES:${PN} += "wsl-appx"

RDEPENDS:${PN} += ""

inherit rpm
