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
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python311-parse_type-0.6.0-1.7.noarch.rpm"
RPM_HASH = "60832028d26e469790770bf3203b4428ed9c788eef09593d03a1b29ea35ae082a9b6af45be39a00d6952fcf312b55a14a17b4e94c960eccb1bf334a764b5e907"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(parse-type) \
python311-parse_type \
python3dist(parse-type)"
RDEPENDS:${PN} += "python(abi) \
python311-parse \
python311-six"

inherit rpm
