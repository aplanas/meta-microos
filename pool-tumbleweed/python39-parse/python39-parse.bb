SUMMARY = "Python module for parsing strings using a 'format' syntax"
DESCRIPTION = "Parse strings using a specification based on the Python format() syntax."
LICENSE = "MIT"

PV = "1.19.0"

RPM_NAME = "python39-parse-1.19.0-1.10.noarch.rpm"
RPM_HASH = "68d63adc41d8d482a4beeb1cc34b8618a28e41c72dc3cb56fcb186351417931a55b9fef8db2616ba620a9e765f0d78741c62bf2539e5acb7835a1dc0b367126c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(parse) \
python39-parse \
python3dist(parse)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
