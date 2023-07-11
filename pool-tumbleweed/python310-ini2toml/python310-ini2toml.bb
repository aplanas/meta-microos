SUMMARY = "Automatic conversion of .ini/cfg files to TOML equivalents"
DESCRIPTION = "The original purpose of this project is to help migrating setup.cfg files \
to PEP 621, but by extension it can also be used to convert any compatible ini_cfg \
file to TOML."
LICENSE = "MPL-2.0"

PV = "0.12"

RPM_NAME = "python310-ini2toml-0.12-2.2.noarch.rpm"
RPM_HASH = "ddf609df3ee7a38a4d5df944933b77b35dafd2203d1f358cbbfa7a9e6b3e4fb88879443ed951f8ce827c20207e8f2719a05a71f7533002247383c4e4e0ade29b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ini2toml \
python310-ini2toml \
python3dist-ini2toml"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-packaging \
update-alternatives"

inherit rpm
