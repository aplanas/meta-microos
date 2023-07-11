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

RPM_NAME = "python310-pyshould-0.7.1-6.14.noarch.rpm"
RPM_HASH = "077979332f50c903ee16879131ac75804d29f95b9d54c0af75219699c507e9c623bd956a470aa2dc4b28d9b291abc043fe32dca42c7119cabc2ab66bd708efc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyshould \
python310-pyshould \
python3dist-pyshould"

RDEPENDS:${PN} += "python-abi \
python310-hamcrest"

inherit rpm
