SUMMARY = "Examples for the GNU Scientific Library"
DESCRIPTION = "This package contains examples for GSL"
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl-examples-2.7.1-2.1.noarch.rpm"
RPM_HASH = "7d90560536751a1feb7f5c587eed7f656b3dad057604a58ad5a800d805729ad32ab1742e59160e603b96a2f6fa8395e11361b3cca50c644b71a7922fa3c96141"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsl-examples"

RDEPENDS:${PN} += ""

inherit rpm
