SUMMARY = "A library for creating wrappers around web APIs"
DESCRIPTION = "Wrapping web APIs made easy. \
A tiny library for creating wrappers around web APIs."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python310-tortilla-0.5.0-2.1.noarch.rpm"
RPM_HASH = "2e24e63bd1611f8977a1d8113385a9a20001a2039a69f24a23702a8f672c19d8e1ad4605e50b89748544874cc63d2c331a59c6d794080f291419a3c855f7795a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tortilla \
python310-tortilla \
python3dist-tortilla"

RDEPENDS:${PN} += "python-abi \
python310-colorama \
python310-formats \
python310-httpretty \
python310-requests \
python310-six"

inherit rpm
