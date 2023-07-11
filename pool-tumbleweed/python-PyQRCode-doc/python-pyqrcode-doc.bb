SUMMARY = "Documentation files for python-PyQRCode"
DESCRIPTION = "HTML Documentation for python-PyQRCode."
LICENSE = "MIT"

PV = "1.3.6"

RPM_NAME = "python-PyQRCode-doc-1.3.6-4.3.noarch.rpm"
RPM_HASH = "7d39fe0a736365ff0516325d5c12a0cd4c986a0b408146013e20ba14dac9a85f2a2fd850724f35d81ef0fc5eed84e4f2e958d89635fccbcff539c883786a93bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-PyQRCode-doc"

RDEPENDS:${PN} += ""

inherit rpm
