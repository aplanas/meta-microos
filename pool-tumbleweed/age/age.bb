SUMMARY = "A file encryption tool"
DESCRIPTION = "Age features small explicit keys, no config options, and UNIX-style \
composability."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "age-1.1.1-1.4.aarch64.rpm"
RPM_HASH = "35d844d4a491373a0d5f0eb51da9de2286aae44bb6dd8bd0b26a31adf8d89bd6fda4555c859b763d8626bfa1ae24d87aaae0e5a95fb7cac713765d7a1816242a"

RPROVIDES:${PN} += "age \
age(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
