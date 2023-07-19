SUMMARY = "Command line filters for processing subunit streams"
DESCRIPTION = "Command line filters for processing subunit streams."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "subunit-filters-1.4.2-3.1.noarch.rpm"
RPM_HASH = "838e2cd16e5331c025305c610c59a344bf1c609c935b45b7c299036cdee348afdf70c64cb5fc595f1c0cc9ee43dc8dcd32d73af59f0be46bb579bde68a9ae1c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "subunit-filters"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python3-junitxml \
python3-python-subunit \
typelib-1-0-Gtk-3-0"

inherit rpm
