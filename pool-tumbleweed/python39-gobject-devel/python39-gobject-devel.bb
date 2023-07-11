SUMMARY = "Metapackage to pull in all of python-gobject's packages"
DESCRIPTION = "This package contains files required to build wrappers for gobject \
addon libraries such as pygtk."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.1"

RPM_NAME = "python39-gobject-devel-3.44.1-2.1.aarch64.rpm"
RPM_HASH = "f2e43c5428281cba8bea85d0e3932dcb28e342d869a3860bd4dfa852084d72a2e52926c6ec79ee2017ced7dfe60d844f079f4adf126354c50430082f36b873f5"

RPROVIDES:${PN} += "python39-gobject-devel"

RDEPENDS:${PN} += "python39-devel \
python39-gobject \
python39-gobject-Gdk \
python39-gobject-cairo \
python39-gobject-common-devel"

inherit rpm
