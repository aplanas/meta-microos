SUMMARY = "Automatic conversion of .ini/cfg files to TOML equivalents"
DESCRIPTION = "The original purpose of this project is to help migrating setup.cfg files \
to PEP 621, but by extension it can also be used to convert any compatible ini_cfg \
file to TOML."
LICENSE = "MPL-2.0"

PV = "0.12"

RPM_NAME = "python311-ini2toml-0.12-2.1.noarch.rpm"
RPM_HASH = "260f815000892ed6c448c15c01ce25aa87766116b1a5b689b3f9da1ccab3bf9fc4c2132234f90424da3edfb8df329ee271c82c78352935079a04337fac0661ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ini2toml \
python311-ini2toml \
python3dist-ini2toml"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-packaging \
update-alternatives"

inherit rpm
