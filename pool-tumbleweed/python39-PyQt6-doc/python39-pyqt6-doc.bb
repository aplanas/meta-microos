SUMMARY = "Examples for python39-PyQt6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains programming examples for PyQt6."
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.5.1"

RPM_NAME = "python39-PyQt6-doc-6.5.1-1.2.noarch.rpm"
RPM_HASH = "372c8435e610d7ae37a19ce14e88d26a2b7e4e90bd1747858f79bc3235b744ac85d86e17c018979d826e92774d9737b8bbdc84b41e64c6b532338c0521b15642"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-PyQt6-doc \
python39-qt6-doc"

RDEPENDS:${PN} += ""

inherit rpm
