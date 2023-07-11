SUMMARY = "Pluggable object copying mechanism"
DESCRIPTION = "This package provides a pluggable mechanism for copying persistent objects. \
 \
Documentation is hosted at https://zopecopy.readthedocs.io/en/latest/"
LICENSE = "ZPL-2.1"

PV = "4.3"

RPM_NAME = "python310-zope.copy-4.3-2.2.noarch.rpm"
RPM_HASH = "cbbf1e19a808f4217fa04faff119496861f730edca68d4029cceb4a7edcbc2f62b6687651132cae6cc6ab0a98fb3360d8b2ab19c8d5ee3b1d85e41b67e0ed106"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zope.copy \
python310-zope.copy \
python3dist-zope.copy"

RDEPENDS:${PN} += "python-abi \
python310-zope.interface"

inherit rpm
