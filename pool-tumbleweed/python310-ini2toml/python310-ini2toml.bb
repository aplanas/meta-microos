SUMMARY = "Automatic conversion of .ini/cfg files to TOML equivalents"
DESCRIPTION = "The original purpose of this project is to help migrating setup.cfg files \
to PEP 621, but by extension it can also be used to convert any compatible ini_cfg \
file to TOML."
LICENSE = "MPL-2.0"

PV = "0.12"

RPM_NAME = "python310-ini2toml-0.12-2.1.noarch.rpm"
RPM_HASH = "7fba187013583bf0dd57ce6ecab4c2581e5cb4fea3a1034fd7818b48b2f1a4f1553c93549abcf3fffb8a8e931c220bca5b80f0b0cfd02665d3f6aa83777dbc14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ini2toml \
python3.10dist-ini2toml \
python310-ini2toml \
python3dist-ini2toml"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-packaging \
update-alternatives"

inherit rpm
