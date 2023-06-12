SUMMARY = "TOML-0.4.0 parser/writer for Python"
DESCRIPTION = "A specs-conforming and strict parser and writer for TOML files. \
The library currently supports version 0.4.0 of the specs. \
 \
The pytoml project is no longer being actively maintained. \
Consider using the toml package instead."
LICENSE = "MIT"

PV = "0.1.21"

RPM_NAME = "python311-pytoml-0.1.21-3.1.noarch.rpm"
RPM_HASH = "5003e01c58f55a711cb125a052ccba8ad2ac29f74c6d93a6592c818cafd68f6513927ec78c98852e759c5d2ddc1b98eba2182df28c23ce929c806a27c258162b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytoml) \
python311-pytoml \
python3dist(pytoml)"
RDEPENDS:${PN} += "python(abi) \
python311"

inherit rpm
