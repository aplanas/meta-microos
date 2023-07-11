SUMMARY = "Sphinx objectsinv Inspection/Manipulation Tool"
DESCRIPTION = "Sphinx objects.inv Inspection/Manipulation Tool"
LICENSE = "MIT"

PV = "2.2.2"

RPM_NAME = "python311-sphobjinv-2.2.2-1.6.noarch.rpm"
RPM_HASH = "6ba859df7e66d86b6aa6b9f0fd05324a4a893b146b49bc81798580b5ffddc1ff776393966aa82ebb5b654e9befa4fcea20d00421ed82bdc70dc93f615f9c8d8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphobjinv \
python3.11dist-sphobjinv \
python311-sphobjinv \
python3dist-sphobjinv"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-attrs \
python311-certifi \
python311-jsonschema \
update-alternatives"

inherit rpm
