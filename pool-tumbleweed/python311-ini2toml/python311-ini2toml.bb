SUMMARY = "Automatic conversion of .ini/cfg files to TOML equivalents"
DESCRIPTION = "The original purpose of this project is to help migrating setup.cfg files \
to PEP 621, but by extension it can also be used to convert any compatible ini_cfg \
file to TOML."
LICENSE = "MPL-2.0"

PV = "0.12"

RPM_NAME = "python311-ini2toml-0.12-2.2.noarch.rpm"
RPM_HASH = "3cdddc95a43535b404c0a6d278204bc0b311ff01ee960b6f18cb5bd67769a91c2ed36d64b6598d0427ef1d5c4dcd9af34825c7268a9d3cb21ed4aed61b3b5ebc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ini2toml \
python3.11dist-ini2toml \
python311-ini2toml \
python3dist-ini2toml"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-packaging \
update-alternatives"

inherit rpm
