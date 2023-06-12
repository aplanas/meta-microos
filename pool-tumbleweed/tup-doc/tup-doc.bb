SUMMARY = "Documentation for tup"
DESCRIPTION = "Documents and examples for tup"
LICENSE = "GPL-2.0-only"

PV = "0.7.11"

RPM_NAME = "tup-doc-0.7.11-1.10.noarch.rpm"
RPM_HASH = "e856f0c5a1bc0c7c3479b6e2f63d5dd23dc58905bb0ecb8ca6356c0a0dec2576b3a3793f5cc9218e38e1257d9538215e39a11d3063501b16f200f271c380c9c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tup-doc"
RDEPENDS:${PN} += "tup"

inherit rpm
