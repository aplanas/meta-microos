SUMMARY = "Development files for libmsym"
DESCRIPTION = "This package contains all necessary include files and libraries \
needed to develop applications that require libmsym."
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "libmsym-devel-0.2.3-2.5.aarch64.rpm"
RPM_HASH = "562c028633d27fc135a3495fe4b1996104e59dc47586c883e62e6cdec3398c1075c36c907dbae51e7e6742b3428a0bcc2e6cf55bd45dd0efbeb7c0dfe970c316"

RPROVIDES:${PN} += "cmake(libmsym) \
libmsym-devel \
libmsym-devel(aarch-64)"
RDEPENDS:${PN} += "libmsym0_2"

inherit rpm
