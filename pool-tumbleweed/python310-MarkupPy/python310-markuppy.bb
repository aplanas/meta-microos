SUMMARY = "An HTML/XML generator"
DESCRIPTION = "This is MarkupPy - a Python module that for generating HTML/XML \
for Python programs."
LICENSE = "SUSE-Public-Domain"

PV = "1.14"

RPM_NAME = "python310-MarkupPy-1.14-1.14.noarch.rpm"
RPM_HASH = "bf9a8fb4baba78afad39b14d57e7c63125c632c3f7a3ae1b6012607e8ee0dba44d5efc5a1da824c32904730988d3589745fd3ff9bf05f67017f3ac2e7b55ddbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-MarkupPy \
python3.10dist(markuppy) \
python310-MarkupPy \
python3dist(markuppy)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
