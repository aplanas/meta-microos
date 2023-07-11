SUMMARY = "A library for managing DNS zones"
DESCRIPTION = "A simple library for managing DNS zones."
LICENSE = "BSD-3-Clause"

PV = "0.9.8"

RPM_NAME = "python39-localzone-0.9.8-2.1.noarch.rpm"
RPM_HASH = "b7cf09074b813e878a628efdb60bc6fb9e63abc0759cb011dba8249e711110e82a7010eede9e0d3bb9ca66959a069ee6eef19c577bdc4ae6359502b72c00100b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-localzone \
python39-localzone \
python3dist-localzone"

RDEPENDS:${PN} += "python-abi \
python39-dnspython"

inherit rpm
