SUMMARY = "Army knife of handling data"
DESCRIPTION = "Army knife of handling data, able to read and write JSON, YAML and TOML, \
and transform, merge and diff datasets. \
 \
Includes jsonknife for splitting files and dereferencing JSON using \
JSON pointer syntax."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python310-dictknife-0.13.0-4.9.noarch.rpm"
RPM_HASH = "e2e244dc00c0d3f7adc204a574f6fe957c0c63e60a795a3280ef43d908d374a380c55bf0321e74a8c48a0ddabac812ff7287610ac0d8df84014214e24e923ef9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dictknife \
python3.10dist-dictknife \
python310-dictknife \
python3dist-dictknife"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
update-alternatives"

inherit rpm
