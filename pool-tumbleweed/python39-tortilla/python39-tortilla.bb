SUMMARY = "A library for creating wrappers around web APIs"
DESCRIPTION = "Wrapping web APIs made easy. \
A tiny library for creating wrappers around web APIs."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python39-tortilla-0.5.0-1.14.noarch.rpm"
RPM_HASH = "41439eb6cd65f31d7e7e06bddccf3dd50f20ee60bdbc8f3446acd56ffd09bcab86914a1cad2d216980439a82d671e0bf3c8c43151f51ef616749abe8388e0c30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tortilla) \
python39-tortilla \
python3dist(tortilla)"

RDEPENDS:${PN} += "python(abi) \
python39-colorama \
python39-formats \
python39-httpretty \
python39-requests \
python39-six"

inherit rpm
