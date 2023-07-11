SUMMARY = "TOML-0.4.0 parser/writer for Python"
DESCRIPTION = "A specs-conforming and strict parser and writer for TOML files. \
The library currently supports version 0.4.0 of the specs. \
 \
The pytoml project is no longer being actively maintained. \
Consider using the toml package instead."
LICENSE = "MIT"

PV = "0.1.21"

RPM_NAME = "python311-pytoml-0.1.21-3.2.noarch.rpm"
RPM_HASH = "45b0ad1b9a222983274bc96d2ea14f3986255feabe1fe6d0bec348b0596277a330a81df7fe1a61742a56233bc4fa2a099ce0f98e633aa921750deb5490f63b5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytoml \
python3.11dist-pytoml \
python311-pytoml \
python3dist-pytoml"

RDEPENDS:${PN} += "python-abi \
python311"

inherit rpm
