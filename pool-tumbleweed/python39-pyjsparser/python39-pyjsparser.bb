SUMMARY = "Javascript parser based on esprimajs"
DESCRIPTION = "A JavaScript parser - a manual translation of esprima.js to Python. \
It supports the whole of ECMAScript 5.1 and parts of ECMAScript 6."
LICENSE = "MIT"

PV = "2.7.1"

RPM_NAME = "python39-pyjsparser-2.7.1-2.1.noarch.rpm"
RPM_HASH = "c5530fddab6b7322d055bd63fee8d115764c57d3f5efcbc7604a2112e2253f0bbed82b1ca36ee91a5f0e7768fd413125ede1677fb6d48cd618034398f2dd6773"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyjsparser) \
python39-pyjsparser \
python3dist(pyjsparser)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
