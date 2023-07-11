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

RPM_NAME = "python39-pyshould-0.7.1-6.14.noarch.rpm"
RPM_HASH = "242f3bab2dc4c3cfcdf9a8f6cef9f7600f786e871bd68bcda6bd3f65f23e612efca79a8dd4486a28d0bfa0c246b12a4eeed9148862ac99d0f5ee4f370b808656"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyshould \
python39-pyshould \
python3dist-pyshould"

RDEPENDS:${PN} += "python-abi \
python39-hamcrest"

inherit rpm
