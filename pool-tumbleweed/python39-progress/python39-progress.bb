SUMMARY = "Progress bars for Python"
DESCRIPTION = "Progress bars for Python."
LICENSE = "ISC"

PV = "1.6"

RPM_NAME = "python39-progress-1.6-2.1.noarch.rpm"
RPM_HASH = "5713df394812a7c039e224aeb4237b11dfcc40e96cf36f57bafa9be9c0eb1c14bb0ae40c3ce060c971fdc2f1b349942d1154fd6e87327a725a9f343ffa462df5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-progress \
python39-progress \
python3dist-progress"

RDEPENDS:${PN} += "python-abi"

inherit rpm
