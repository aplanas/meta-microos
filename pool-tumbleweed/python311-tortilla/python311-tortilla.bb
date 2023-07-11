SUMMARY = "A library for creating wrappers around web APIs"
DESCRIPTION = "Wrapping web APIs made easy. \
A tiny library for creating wrappers around web APIs."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python311-tortilla-0.5.0-2.1.noarch.rpm"
RPM_HASH = "1205990924bdff88318cf2e6a50ed3b16bef031cffc367472ec618c5c051170707a5eec24756b30377b71b3f9b9658edbdefb37ef84b191d94cbb7b604a8f1c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tortilla \
python3.11dist-tortilla \
python311-tortilla \
python3dist-tortilla"

RDEPENDS:${PN} += "python-abi \
python311-colorama \
python311-formats \
python311-httpretty \
python311-requests \
python311-six"

inherit rpm
