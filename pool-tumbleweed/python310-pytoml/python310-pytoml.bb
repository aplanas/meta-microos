SUMMARY = "TOML-0.4.0 parser/writer for Python"
DESCRIPTION = "A specs-conforming and strict parser and writer for TOML files. \
The library currently supports version 0.4.0 of the specs. \
 \
The pytoml project is no longer being actively maintained. \
Consider using the toml package instead."
LICENSE = "MIT"

PV = "0.1.21"

RPM_NAME = "python310-pytoml-0.1.21-3.2.noarch.rpm"
RPM_HASH = "71f8705ee4e5ee76ce6273011261dbe5563c7ace96584594aee22aade4aaac22906e163fc1b354d2fc94483b7e33806b3ef27148941233bc4e8859cb44fd7e77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytoml \
python310-pytoml \
python3dist-pytoml"

RDEPENDS:${PN} += "python-abi \
python310"

inherit rpm
