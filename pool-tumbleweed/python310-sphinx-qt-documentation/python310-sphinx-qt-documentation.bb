SUMMARY = "Sphinx Qt documentation"
DESCRIPTION = "This is plugin to add cross-link to qt documentation for python code created with PyQt5/6 or PySide2/6."
LICENSE = "BSD-2-Clause"

PV = "0.4.1"

RPM_NAME = "python310-sphinx-qt-documentation-0.4.1-1.2.noarch.rpm"
RPM_HASH = "557f47b0bfc1dbb63b5c959be4ad97d8fb3a57d03d921cb6932bda46c079c0ed2be4fbee58fbd891bd446dc440e12cc731550fa2ebb5d38a92b78fd8341005e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-qt-documentation \
python3.10dist(sphinx-qt-documentation) \
python310-sphinx-qt-documentation \
python3dist(sphinx-qt-documentation)"
RDEPENDS:${PN} += "python(abi) \
python310-Sphinx"

inherit rpm
