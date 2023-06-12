SUMMARY = "Developer documentation for GTK"
DESCRIPTION = "This package contains developer documentation for version 4 of the GTK \
widget toolkit."
LICENSE = "LGPL-2.1-or-later"

PV = "4.10.3"

RPM_NAME = "gtk4-docs-4.10.3-4.1.noarch.rpm"
RPM_HASH = "307f6cb7ad05d12948c61941fc36650d0dcdb974dc1e6969e9711e8cb45abb7f2ec6339d51fece7229a0713f9a0fc955ad78fbd567cdf0ace2f7b051585e8385"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-docs"
RDEPENDS:${PN} += ""

inherit rpm
