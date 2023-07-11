SUMMARY = "Spinner for Click"
DESCRIPTION = "Spinner for Click."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python310-click-spinner-0.1.10-2.5.noarch.rpm"
RPM_HASH = "40cddcb3031c6298f81be8a47455691461d7f03d4407a9e9895e19df712ea70c0b718051cdc60a14ae5b972781118cd0be45809f4729dbea2672f03ea6363b03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-click-spinner \
python310-click-spinner \
python3dist-click-spinner"

RDEPENDS:${PN} += "python-abi \
python310-click"

inherit rpm
