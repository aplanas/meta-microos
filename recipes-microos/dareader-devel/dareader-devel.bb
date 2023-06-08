SUMMARY = "Development tools for dareader"
DESCRIPTION = "The dareader-devel package contains the header files for dareader."
LICENSE = "GPL-3.0+"

PV = "0.0.0+git20220726.2d7d79c"

RPM_NAME = "dareader-devel-0.0.0+git20220726.2d7d79c-2.2.aarch64.rpm"
RPM_HASH = "0784cbbb70a74241ff7b8ad1fa1a4bed3c609e80650f7cf51d2b5e1d137ae0416bbf2d042540724b40089ca25a59fd6f67e22132c589d8a07cf633d956980b0e"

RPROVIDES:${PN} += "dareader-devel dareader-devel(aarch-64) pkgconfig(dareader)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libdareader1"

inherit rpm
