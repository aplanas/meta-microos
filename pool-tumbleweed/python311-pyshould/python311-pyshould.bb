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

RPM_NAME = "python311-pyshould-0.7.1-6.12.noarch.rpm"
RPM_HASH = "6f11d0d42a24fe40d59ae0a044ac8fc9da3b221da3465e20430b5870c4298b92c343fcdb0f1fadeba14fca3cc4b2702c06deefcf76a8eb922d93a05d6b4f1f3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyshould) \
python311-pyshould \
python3dist(pyshould)"
RDEPENDS:${PN} += "python(abi) \
python311-hamcrest"

inherit rpm
