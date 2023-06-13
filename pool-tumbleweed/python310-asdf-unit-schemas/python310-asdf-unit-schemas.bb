SUMMARY = "ASDF schemas for units"
DESCRIPTION = "This package provides ASDF schemas for validating unit tags."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "python310-asdf-unit-schemas-0.1.0-1.1.noarch.rpm"
RPM_HASH = "f8bf5bd8721d2b6f6dcdc823613df754caa3f7ef1e52d3217dc1356a6b464b1a75931d17506d32b73890ee1884cb0f2ff3ed08354ad6d57e8960753ebd7febde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asdf-unit-schemas \
python3-asdf_unit_schemas \
python3.10dist(asdf-unit-schemas) \
python310-asdf-unit-schemas \
python310-asdf_unit_schemas \
python3dist(asdf-unit-schemas)"

RDEPENDS:${PN} += "(python310-importlib_resources >= 3 if python310-base < 3.9) \
python(abi) \
python310-asdf-standard"

inherit rpm
