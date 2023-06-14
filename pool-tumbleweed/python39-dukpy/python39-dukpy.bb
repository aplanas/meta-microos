SUMMARY = "JavaScript interpreter for Python"
DESCRIPTION = "DukPy is a javascript interpreter for Python built on top of \
duktape engine. \
It comes with a bunch of common transpilers built-in for convenience: \
 \
    - CoffeeScript \
    - BabelJS \
    - TypeScript \
    - JSX \
    - LESS"
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-dukpy-0.3.0-1.5.aarch64.rpm"
RPM_HASH = "a11c01fe696fb2ad29c0108565f088d884989e9f599a63e1b865d4459c01f375b3f9c3843224d680d6a6700354ea3d2238e5133206e61a16eb6660cb35136343"

RPROVIDES:${PN} += "python3.9dist-dukpy \
python39-dukpy \
python3dist-dukpy"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
