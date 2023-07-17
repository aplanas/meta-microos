SUMMARY = "SUSE on Windows application"
DESCRIPTION = "Windows Store application providing SLES or openSUSE."
LICENSE = "MIT"

PV = "1"

RPM_NAME = "wsl-appx-1-13.623.aarch64.rpm"
RPM_HASH = "53da0c43755d293be85769458831da3759c36e69c5034e5581e4ac419966850e2f8a5ec883c6c68bc468c14bef73763ec083896ab7ed71c57b7cb21c223c3b66"

RPROVIDES:${PN} += "wsl-appx"

RDEPENDS:${PN} += ""

inherit rpm
