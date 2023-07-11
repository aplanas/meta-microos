SUMMARY = "Examples for python310-PyQt6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains programming examples for PyQt6."
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-doc-6.5.0-2.2.noarch.rpm"
RPM_HASH = "75d97d136bb279952760524163ea3bed2adde2eaf60be0673e555cd4b614cb18aba18721949ed2ef924c8a64b0c5146e3c93816488939f5da5dfc22600a1cd8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-PyQt6-doc \
python310-qt6-doc"

RDEPENDS:${PN} += ""

inherit rpm
