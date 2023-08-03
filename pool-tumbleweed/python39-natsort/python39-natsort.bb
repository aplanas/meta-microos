SUMMARY = "Natural sorting in Python"
DESCRIPTION = "Natsort provides a function natsorted that helps sort lists \
'naturally' ('naturally' is rather ill-defined, but in general it means \
sorting based on meaning and not computer code point)."
LICENSE = "MIT"

PV = "8.4.0"

RPM_NAME = "python39-natsort-8.4.0-1.1.noarch.rpm"
RPM_HASH = "a6c9768cb2029ebe7d7369340546b2656c403baaace98e06c948fcaeb899edc9bbbf22a105b4c8e5f5c433534f32d47d80542a4044e7da4d5151949d5cbbccc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-natsort \
python39-natsort \
python3dist-natsort"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
