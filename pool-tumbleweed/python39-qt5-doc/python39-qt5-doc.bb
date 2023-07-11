SUMMARY = "Examples for python39-qt5"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains programming examples for PyQt5."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python39-qt5-doc-5.15.9-3.1.noarch.rpm"
RPM_HASH = "1c331642811a05c34596f6f8006954780dd2e7bf02bc5c52d5ff48cc4089c209acb7636741307b97878bdfa8b579606c5737ea2cffd7c639ca0d965b151e1547"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-PyQt5-doc \
python39-qt5-doc"

RDEPENDS:${PN} += ""

inherit rpm
