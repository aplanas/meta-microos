SUMMARY = "Extension to the parse module"
DESCRIPTION = "parse_type extends the parse module (opposite of string.format()) with \
the following features: \
 \
  * build type converters for common use cases (enum/mapping, choice) \
  * build a type converter with a cardinality constraint (0..1, 0..*, 1..*) \
    from the type converter with cardinality=1. \
  * compose a type converter from other type converters \
  * an extended parser that supports the CardinalityField naming schema \
    and creates missing type variants (0..1, 0..*, 1..*) from the \
    primary type converter"
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "python310-parse_type-0.6.1-1.1.noarch.rpm"
RPM_HASH = "fe22650d002749aa592f658962037bb3f3e8e9bb66bcb30602ae1cadd62b60e6292d57ad5850711b849d55bdd772772a78ac292f0aa6bc97007a077fd8fee24e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-parse-type \
python310-parse-type \
python3dist-parse-type"

RDEPENDS:${PN} += "python-abi \
python310-parse \
python310-six"

inherit rpm
