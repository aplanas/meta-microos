SUMMARY = "Should style asserts"
DESCRIPTION = "PyShould is a Python DSL allowing to write expectations or assertions \
in almost natural language. The goal is to offer an expressive yet \
readable syntax to define the expectations in detail. \
 \
Under the hood it uses the PyHamcrest library of matchers to build \
complex matching predicates and great explanations when there is a \
mismatch. \
 \
Its primary use case is in unit testing, replacing the need for \
Python's native assertX methods. Its use is completely transparent \
to the unit testing runner used, since mismatches are reported using \
the standard AssertionError."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python39-pyshould-0.7.1-6.12.noarch.rpm"
RPM_HASH = "65cd8a7e27429c38d3c894cdbe4680d179207e1ae2aabc8145bf2c2c380201e0241b7e2947de689ad1a9ee10df64cb633ed95d1b45324e40b159b508f5828829"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyshould \
python39-pyshould \
python3dist-pyshould"

RDEPENDS:${PN} += "python-abi \
python39-hamcrest"

inherit rpm
