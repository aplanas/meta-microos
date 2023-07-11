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

RPM_NAME = "python39-parse_type-0.6.1-1.1.noarch.rpm"
RPM_HASH = "bd83c923f15a1243ddd3f1db300268805c6ea08587ee617a62610f6bc98a09943e7eb1180c7ce89356cb52407184d2f73ad49480343407eb59957f4fe2035330"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-parse-type \
python39-parse-type \
python3dist-parse-type"

RDEPENDS:${PN} += "python-abi \
python39-parse \
python39-six"

inherit rpm
