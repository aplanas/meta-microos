SUMMARY = "Automatic conversion of .ini/cfg files to TOML equivalents"
DESCRIPTION = "The original purpose of this project is to help migrating setup.cfg files \
to PEP 621, but by extension it can also be used to convert any compatible ini_cfg \
file to TOML."
LICENSE = "MPL-2.0"

PV = "0.12"

RPM_NAME = "python39-ini2toml-0.12-2.2.noarch.rpm"
RPM_HASH = "fb73612ccb095cd7cc15c8b6f2e235fb9bb84ea0fc8a24c49502c2aeaff82a6f869ab0f3b9c341e4a66bf81e881d0813fe1265458d842a67c54e693b02ae5fa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ini2toml \
python39-ini2toml \
python3dist-ini2toml"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-packaging \
update-alternatives"

inherit rpm
