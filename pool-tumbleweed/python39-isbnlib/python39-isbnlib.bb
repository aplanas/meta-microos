SUMMARY = "Extract, clean, transform, hyphenate and metadata for ISBNs"
DESCRIPTION = "Extract, clean, transform, hyphenate and metadata for ISBNs \
(International Standard Book Number)."
LICENSE = "LGPL-3.0-only"

PV = "3.10.12"

RPM_NAME = "python39-isbnlib-3.10.12-1.4.noarch.rpm"
RPM_HASH = "29f804db330e91cb9c09382248578ea0663eeaac22bcd1d355d45df584aff27dbf77c935f4574961ae00764082a3abcfda89fac20d1252d460497c5a1467e0e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(isbnlib) \
python39-isbnlib \
python3dist(isbnlib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
