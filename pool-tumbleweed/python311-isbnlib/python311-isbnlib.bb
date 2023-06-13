SUMMARY = "Extract, clean, transform, hyphenate and metadata for ISBNs"
DESCRIPTION = "Extract, clean, transform, hyphenate and metadata for ISBNs \
(International Standard Book Number)."
LICENSE = "LGPL-3.0-only"

PV = "3.10.12"

RPM_NAME = "python311-isbnlib-3.10.12-1.4.noarch.rpm"
RPM_HASH = "920c9337bea5eb0e43d2dd8e7c70c7be33e6180496c1cbca575f6b7a76a0e976d3445f0746e57cc497ebde0df79d2c3b4f5abd4f5fce2594c6e21dc102391bc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(isbnlib) \
python311-isbnlib \
python3dist(isbnlib)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
