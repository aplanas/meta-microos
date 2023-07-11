SUMMARY = "Create configuration schemas, and process and validate configurations"
DESCRIPTION = "Create configuration schemas, and process and validate configurations."
LICENSE = "LGPL-3.0-only"

PV = "3.0"

RPM_NAME = "python39-lazr.config-3.0-1.1.noarch.rpm"
RPM_HASH = "3d6075b74103bfef86c1fec0f6d22d6603d7effc02202027257f98514acac609cde3e9d525356212076969eb3367d160749b614cf77d5a15cead297947dbe307"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-lazr.config \
python39-lazr.config \
python3dist-lazr.config"

RDEPENDS:${PN} += "python-abi \
python39-lazr.delegates \
python39-zope.interface"

inherit rpm
