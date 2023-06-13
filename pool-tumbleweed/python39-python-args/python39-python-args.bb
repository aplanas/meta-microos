SUMMARY = "Python argument design patterns in a composable interface"
DESCRIPTION = "Python argument design patterns in a composable interface."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "python39-python-args-1.0.2-1.11.noarch.rpm"
RPM_HASH = "f7e164e7072fa1800f049fa8485f3000a10e0dde7afaf214687b7411ae53696c14d5c0baf49a36eca9e5b2f22e5a3e7d224bd01c1836fadc40f77da4391496b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-args) \
python39-python-args \
python3dist(python-args)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
