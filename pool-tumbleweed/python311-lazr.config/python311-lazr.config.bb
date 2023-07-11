SUMMARY = "Create configuration schemas, and process and validate configurations"
DESCRIPTION = "Create configuration schemas, and process and validate configurations."
LICENSE = "LGPL-3.0-only"

PV = "3.0"

RPM_NAME = "python311-lazr.config-3.0-1.1.noarch.rpm"
RPM_HASH = "1cede88aedace17af599102c2a3441208d2cda8b8ca216afb2e2c67d97d888f43fafc580a6e7badd5d4d8b2eef8ea578f4fa342211c8622a04954b70765f8e55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lazr.config \
python3.11dist-lazr.config \
python311-lazr.config \
python3dist-lazr.config"

RDEPENDS:${PN} += "python-abi \
python311-lazr.delegates \
python311-zope.interface"

inherit rpm
