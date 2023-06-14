SUMMARY = "Code Metrics in Python"
DESCRIPTION = "Radon is a Python tool that computes various metrics from the source code. \
Radon can compute: \
 \
* McCabe's complexity**, i.e. cyclomatic complexity \
* raw metrics (these include SLOC, comment lines, blank lines, &c.) \
* Halstead metrics (all of them) \
* Maintainability Index (the one used in Visual Studio)"
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "python39-radon-5.1.0-1.4.noarch.rpm"
RPM_HASH = "3e93422ce6585fa066b320dbaec25ce2defd830c8c178c9c471455a327f2c625396c8c865d76bba03e20ece374119608ad9a669c7de9f831387a7f20c9bcda20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-radon \
python39-radon \
python3dist-radon"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-colorama \
python39-future \
python39-mando \
update-alternatives"

inherit rpm
