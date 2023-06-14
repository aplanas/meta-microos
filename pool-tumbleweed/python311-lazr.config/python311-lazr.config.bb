SUMMARY = "Create configuration schemas, and process and validate configurations"
DESCRIPTION = "Create configuration schemas, and process and validate configurations."
LICENSE = "LGPL-3.0-only"

PV = "2.2.3"

RPM_NAME = "python311-lazr.config-2.2.3-1.8.noarch.rpm"
RPM_HASH = "a9f1591fbee539f8191863770d53ad277719bb7cfa25f838296426bdd0c6058c289d6fae60f0ec2c48685a5f1ae31facb66a34eabb3ef4b7f9c5cade059f5927"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-lazr.config \
python311-lazr.config \
python3dist-lazr.config"

RDEPENDS:${PN} += "python-abi \
python311-lazr.delegates \
python311-zope.interface"

inherit rpm
