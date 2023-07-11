SUMMARY = "Examples for python311-qt5"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains programming examples for PyQt5."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python311-qt5-doc-5.15.9-3.1.noarch.rpm"
RPM_HASH = "ee23d62ec8216bfdeb763395a241c20994d22f38a46ac8458fd348ae63fa427b481173aa69fd02dc44485929dc9b1194bab154a78c71eed12c42351026857ddd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyQt5-doc \
python3-qt5-doc \
python311-PyQt5-doc \
python311-qt5-doc"

RDEPENDS:${PN} += ""

inherit rpm
