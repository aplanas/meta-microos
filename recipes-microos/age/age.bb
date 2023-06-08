SUMMARY = "A file encryption tool"
DESCRIPTION = "Age features small explicit keys, no config options, and UNIX-style \
composability."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "age-1.1.1-1.3.aarch64.rpm"
RPM_HASH = "50a27c66e50a86ef28933f09b39759741927e36b8e4d4e3b20fd78ee7b5558e50dcc140f5c04d412562b561fe4786434d93f419b450cfe7f27a31fe3aab5fb8b"

RPROVIDES:${PN} += "age age(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
