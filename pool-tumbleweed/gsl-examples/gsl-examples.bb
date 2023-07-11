SUMMARY = "Examples for the GNU Scientific Library"
DESCRIPTION = "This package contains examples for GSL"
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl-examples-2.7.1-1.4.noarch.rpm"
RPM_HASH = "ce88fc20437738e0661719c80546e89057186efda5ec7080956c4d011be19addd9a2a4c0ea9864ac2546ba4f532e1fa77d0446ce498e7fa4a9a75674d5f06374"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsl-examples"

RDEPENDS:${PN} += ""

inherit rpm
