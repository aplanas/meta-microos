SUMMARY = "Examples for python310-qt5"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains programming examples for PyQt5."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python310-qt5-doc-5.15.9-3.1.noarch.rpm"
RPM_HASH = "3c84104cd05079054853ece667851f0268fba8341e2434162ae97d32d9e299d411f83baa4056c8922fb855f33151b60b5a89dede00cffc3ed474e8c8cda57cf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-PyQt5-doc \
python310-qt5-doc"

RDEPENDS:${PN} += ""

inherit rpm
