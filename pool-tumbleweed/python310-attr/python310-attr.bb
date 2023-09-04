SUMMARY = "Python module for setting attributes of target functions or classes"
DESCRIPTION = "A decorator to set attributes of target function or class in a DRY way."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python310-attr-0.3.2-2.1.noarch.rpm"
RPM_HASH = "50a50d4bfa998c92f89b7b1b7386a032b6606d6a4b6729eccbdea5aac8bbdc3ecc05569e9782871570b20bccae44f287797d3f7469be16aa4d32b7a61724c17f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-attr \
python310-attr \
python3dist-attr"

RDEPENDS:${PN} += "python-abi"

inherit rpm
