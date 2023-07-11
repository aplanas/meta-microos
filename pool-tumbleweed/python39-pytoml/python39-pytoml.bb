SUMMARY = "TOML-0.4.0 parser/writer for Python"
DESCRIPTION = "A specs-conforming and strict parser and writer for TOML files. \
The library currently supports version 0.4.0 of the specs. \
 \
The pytoml project is no longer being actively maintained. \
Consider using the toml package instead."
LICENSE = "MIT"

PV = "0.1.21"

RPM_NAME = "python39-pytoml-0.1.21-3.2.noarch.rpm"
RPM_HASH = "6d4cacf3e92f4c72be7a94d5fe49deac100f6d5d6759c4d8bdd3d64bfd188561708995720317db177857350c24ce67491cd4bc06d1ebc9dd9771b6f35d493ad6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytoml \
python39-pytoml \
python3dist-pytoml"

RDEPENDS:${PN} += "python-abi \
python39"

inherit rpm
