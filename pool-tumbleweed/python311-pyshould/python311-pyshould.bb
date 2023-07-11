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

RPM_NAME = "python311-pyshould-0.7.1-6.14.noarch.rpm"
RPM_HASH = "aaf17579ed434711ba752669e8e045040490f94ee75286913d089015758db63e707b1993f4b83fe793db0bf11c8820a5056fd31441f36b344a2caeb621846dcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyshould \
python3.11dist-pyshould \
python311-pyshould \
python3dist-pyshould"

RDEPENDS:${PN} += "python-abi \
python311-hamcrest"

inherit rpm
