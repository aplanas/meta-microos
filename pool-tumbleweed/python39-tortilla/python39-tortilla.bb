SUMMARY = "A library for creating wrappers around web APIs"
DESCRIPTION = "Wrapping web APIs made easy. \
A tiny library for creating wrappers around web APIs."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python39-tortilla-0.5.0-2.1.noarch.rpm"
RPM_HASH = "0d986503f3c8150f3aeaaf95962dab2e166cbaf4b6d41bb6bf315e550aae261f1ade9fe3950354ece1d856d0bfc1ec282e982b815687171954067c30340c0dc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tortilla \
python39-tortilla \
python3dist-tortilla"

RDEPENDS:${PN} += "python-abi \
python39-colorama \
python39-formats \
python39-httpretty \
python39-requests \
python39-six"

inherit rpm
