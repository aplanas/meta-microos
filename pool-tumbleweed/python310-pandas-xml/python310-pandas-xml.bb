SUMMARY = "The python pandas[xml] extra"
DESCRIPTION = "This package provides the [xml] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-pandas-xml-2.1.0-1.2.noarch.rpm"
RPM_HASH = "6a4ae888834a48d53b348147b0aec2e3ac76c500cab572759c73436acd4b771364259826d478931a5f7e9d799ee15547c41319bd50b79ab7ed6138fdca07a6fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-xml"

RDEPENDS:${PN} += "python310-lxml \
python310-pandas"

inherit rpm
