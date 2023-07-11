SUMMARY = "The python pandas[xml] extra"
DESCRIPTION = "This package provides the [xml] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python310-pandas-xml-2.0.2-4.1.noarch.rpm"
RPM_HASH = "56a92de02436cbf96ca79cdc74cf9a179cfc3bf37c965101fa693f80ea4d01cfa2ed16926aa24fbd360a1afe898d545d2421c1e3cb3180a4468beed75905cb01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-xml"

RDEPENDS:${PN} += "python310-lxml \
python310-pandas"

inherit rpm
