SUMMARY = "Python - JSON-Patches"
DESCRIPTION = "Python module to apply JSON-Patches (according to RFC 6902)."
LICENSE = "BSD-3-Clause"

PV = "1.32"

RPM_NAME = "python39-jsonpatch-1.32-4.1.noarch.rpm"
RPM_HASH = "e64694aed67dde9d70b942122b55039da5d05b12e04f99d3a5be688da231d43c670b4b826104a81c8da4b5a00d2477ca9af00614ac37000a57a9535bf820f361"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jsonpatch) \
python39-jsonpatch \
python3dist(jsonpatch)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
alts \
python(abi) \
python39-jsonpointer"

inherit rpm
