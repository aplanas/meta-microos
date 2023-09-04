SUMMARY = "Development documents of libfprint"
DESCRIPTION = "This package contains the development documents for libfprint."
LICENSE = "LGPL-2.1-or-later"

PV = "1.94.6+tod1"

RPM_NAME = "libfprint-doc-1.94.6+tod1-1.1.noarch.rpm"
RPM_HASH = "098b81486bedcaec6819d3256cc5614ff7b4b1ab0a3b49273b6146c7ad83636341a5095d8df4cc3850dfcefd514f0034edb20f2c4816d13881d898387697ce95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfprint-doc"

RDEPENDS:${PN} += ""

inherit rpm
