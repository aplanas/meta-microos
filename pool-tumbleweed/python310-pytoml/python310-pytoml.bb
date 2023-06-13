SUMMARY = "TOML-0.4.0 parser/writer for Python"
DESCRIPTION = "A specs-conforming and strict parser and writer for TOML files. \
The library currently supports version 0.4.0 of the specs. \
 \
The pytoml project is no longer being actively maintained. \
Consider using the toml package instead."
LICENSE = "MIT"

PV = "0.1.21"

RPM_NAME = "python310-pytoml-0.1.21-3.1.noarch.rpm"
RPM_HASH = "633cd3a7361ccd4eb0280348fae8ddb174167a6d16fda45de0358cf17c0b4fdf9bdbd2a803753daba2d0a35c4ea82135992e6109fece004414de29aa8b1c61d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytoml \
python3.10dist(pytoml) \
python310-pytoml \
python3dist(pytoml)"

RDEPENDS:${PN} += "python(abi) \
python310"

inherit rpm
