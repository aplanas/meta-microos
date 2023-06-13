SUMMARY = "Python bindings for the GTK+ widget set"
DESCRIPTION = "PyGTK is an extension module for python that gives you access to the \
GTK+ widget set.  Just about anything you can write in C with GTK+ you \
can write in python with PyGTK (within reason), but with all of \
python's benefits."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.0"

RPM_NAME = "python-gtk-doc-2.24.0-22.8.noarch.rpm"
RPM_HASH = "b0dbc42bda5f2fcfe2e169b8d83e487ff82bb40798f4b5218ef129134637fd90576f28717a7d73be0fd3a3e9fa6dcb01bc0775216548e346f18e24b54a32e363"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-gtk-doc"

RDEPENDS:${PN} += "python-gtk"

inherit rpm
