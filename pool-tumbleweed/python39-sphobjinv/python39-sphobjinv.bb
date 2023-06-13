SUMMARY = "Sphinx objectsinv Inspection/Manipulation Tool"
DESCRIPTION = "Sphinx objects.inv Inspection/Manipulation Tool"
LICENSE = "MIT"

PV = "2.2.2"

RPM_NAME = "python39-sphobjinv-2.2.2-1.4.noarch.rpm"
RPM_HASH = "d719ad0f5c8aaadf95279685139c554470fcdc04e4844fbdbac9047892cb3bd820134455a5bc478e607c75ff4d7886d069e105521903ede0b143771af0f46e8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphobjinv) \
python39-sphobjinv \
python3dist(sphobjinv)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-attrs \
python39-certifi \
python39-jsonschema \
update-alternatives"

inherit rpm
