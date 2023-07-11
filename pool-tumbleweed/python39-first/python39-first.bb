SUMMARY = "Python library to return the first true value of an iterable"
DESCRIPTION = "A Python library that returns the first true value of an iterable."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python39-first-2.0.2-4.5.noarch.rpm"
RPM_HASH = "1e6cabb703aa54652406b3ae44dbc5eb7b8c4af8d434261301220f9600a2cc3afe7ad791ea4d2b8ef6762b8039e24ec66c563696700569d146313f9b645a5db6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-first \
python39-first \
python3dist-first"

RDEPENDS:${PN} += "python-abi"

inherit rpm
