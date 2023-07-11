SUMMARY = "An HTML/XML generator"
DESCRIPTION = "This is MarkupPy - a Python module that for generating HTML/XML \
for Python programs."
LICENSE = "SUSE-Public-Domain"

PV = "1.14"

RPM_NAME = "python39-MarkupPy-1.14-1.16.noarch.rpm"
RPM_HASH = "87ad8a04e22f9358d387e3c7fced137c01995ba46508192ee37079448f23820b21dfdf767acc320fd70714a62b0634f4ac9de71bbc63e6d4e451f4b781de5d7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-markuppy \
python39-MarkupPy \
python3dist-markuppy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
