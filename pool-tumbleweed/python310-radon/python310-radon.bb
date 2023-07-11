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

RPM_NAME = "python310-radon-5.1.0-2.3.noarch.rpm"
RPM_HASH = "44246825103f5fac55df899043e0d2545e9bb6386bea02e96c2ce7a7f98add55b66de03bf7f1909d3588b7c19450d3c4b3f396bc523892686d21d6add60f7d49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-radon \
python310-radon \
python3dist-radon"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-colorama \
python310-future \
python310-mando \
update-alternatives"

inherit rpm
