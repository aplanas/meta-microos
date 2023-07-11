SUMMARY = "Python bindings for the GTK+ widget set"
DESCRIPTION = "PyGTK is an extension module for python that gives you access to the \
GTK+ widget set.  Just about anything you can write in C with GTK+ you \
can write in python with PyGTK (within reason), but with all of \
python's benefits."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.0"

RPM_NAME = "python-gtk-doc-2.24.0-22.9.noarch.rpm"
RPM_HASH = "817ece3d5165d82a8837dbc970e038e7f1953bce018f5772551f55c3a4204d892830e97b4592b8f5c88ef3a2741fae35f102f62d5bedfc78f42e6873d83fee11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-gtk-doc"

RDEPENDS:${PN} += "python-gtk"

inherit rpm
