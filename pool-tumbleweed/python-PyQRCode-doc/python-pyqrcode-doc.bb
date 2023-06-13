SUMMARY = "Documentation files for python-PyQRCode"
DESCRIPTION = "HTML Documentation for python-PyQRCode."
LICENSE = "MIT"

PV = "1.3.6"

RPM_NAME = "python-PyQRCode-doc-1.3.6-4.1.noarch.rpm"
RPM_HASH = "6a4ec60e1a396ef9c83be0ea56fbdfa0a82af3d92064c8952977906113b8e2ee74c5becef0bbc32de5431e7f413a87cee0ced7a1c9dcd4dd03a4a1b1725c5ab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-PyQRCode-doc"

RDEPENDS:${PN} += ""

inherit rpm
