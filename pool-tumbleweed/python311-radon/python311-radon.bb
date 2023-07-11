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

RPM_NAME = "python311-radon-5.1.0-2.3.noarch.rpm"
RPM_HASH = "e4498f3c3891a7dd5e9f785d950bf9702366c46e904871403ac2759e916dc0e44dc8b2a7a4d5387fd4092ae0f3c9707ba3d08a3ed2f472eb18799f0d0173f380"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-radon \
python3.11dist-radon \
python311-radon \
python3dist-radon"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-colorama \
python311-future \
python311-mando \
update-alternatives"

inherit rpm
