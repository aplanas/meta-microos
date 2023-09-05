SUMMARY = "Code Metrics in Python"
DESCRIPTION = "Radon is a Python tool that computes various metrics from the source code. \
Radon can compute: \
 \
* McCabe's complexity**, i.e. cyclomatic complexity \
* raw metrics (these include SLOC, comment lines, blank lines, &c.) \
* Halstead metrics (all of them) \
* Maintainability Index (the one used in Visual Studio)"
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python39-radon-6.0.1-1.1.noarch.rpm"
RPM_HASH = "f018a133a994876740f21cfb027065b183d9604dc3f1a1b3cab6ad6dd974aeb9de4c3a4631fafc7aed56a111ed688a5a307d030ec86ce67194df56d54237f16c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-radon \
python39-radon \
python3dist-radon"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-colorama \
python39-mando \
update-alternatives"

inherit rpm
