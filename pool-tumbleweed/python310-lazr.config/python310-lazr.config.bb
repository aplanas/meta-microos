SUMMARY = "Create configuration schemas, and process and validate configurations"
DESCRIPTION = "Create configuration schemas, and process and validate configurations."
LICENSE = "LGPL-3.0-only"

PV = "3.0"

RPM_NAME = "python310-lazr.config-3.0-1.1.noarch.rpm"
RPM_HASH = "be0aa9487a41f875618e75b64c33ab89852c7b4266464b4e4a6628217ff922aad44dd9dbc7d0aa3a552d68b21a3acf7d7b445dea42f4a834576bd3ce49b7c3ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-lazr.config \
python310-lazr.config \
python3dist-lazr.config"

RDEPENDS:${PN} += "python-abi \
python310-lazr.delegates \
python310-zope.interface"

inherit rpm
