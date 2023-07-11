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

RPM_NAME = "python311-parse_type-0.6.1-1.1.noarch.rpm"
RPM_HASH = "aa72792e8bc6ab5de53756f3d2c8ef6039ebeeb71ba47d277a837d7b085fcae64b4fbbec5ea76c8403270495c7844d8666f7974c9c7a182dc215bc431a39b279"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parse-type \
python3.11dist-parse-type \
python311-parse-type \
python3dist-parse-type"

RDEPENDS:${PN} += "python-abi \
python311-parse \
python311-six"

inherit rpm
