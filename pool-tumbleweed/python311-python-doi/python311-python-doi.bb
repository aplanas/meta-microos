SUMMARY = "Python package to work with Document Object Identifier (doi)"
DESCRIPTION = "Python package to work with Document Object Identifier (doi)"
LICENSE = "GPL-3.0-only"

PV = "0.2.0"

RPM_NAME = "python311-python-doi-0.2.0-1.3.noarch.rpm"
RPM_HASH = "efe69b3fdcfcc83d2d9c474541efb1d896c9cb6afa2ad64f7fa0d5d632f520f98965bb74611720b61d12150cf694336c9b4c22458c03a4767159f7569a84ea2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-doi) \
python311-python-doi \
python3dist(python-doi)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
