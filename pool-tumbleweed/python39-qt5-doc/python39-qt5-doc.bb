SUMMARY = "Examples for python39-qt5"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains programming examples for PyQt5."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python39-qt5-doc-5.15.9-1.6.noarch.rpm"
RPM_HASH = "f314bdead05ce994843039a7548db1c1381ca0bbaceac10772c0e52204236b160a73d90274df1e5e1836cedcc88292229c4946c45e45a8edf1be922a076af330"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-PyQt5-doc \
python39-qt5-doc"
RDEPENDS:${PN} += ""

inherit rpm
