SUMMARY = "Easily write objects that delegate behavior"
DESCRIPTION = "Easily write objects that delegate behavior"
LICENSE = "LGPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "python39-lazr.delegates-2.1.0-1.1.noarch.rpm"
RPM_HASH = "a1ac70a58ee1a94ec5e33568922fddbb9f7d78b6e316eb0490c69478af2ba745f7c65ae4bd4e4926ae5eec5cd2b41d349901a7ec160846aacdecc03bcd5994df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-lazr.delegates \
python39-lazr.delegates \
python3dist-lazr.delegates"

RDEPENDS:${PN} += "python-abi \
python39-zope.interface"

inherit rpm
