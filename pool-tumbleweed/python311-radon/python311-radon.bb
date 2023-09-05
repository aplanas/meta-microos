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

RPM_NAME = "python311-radon-6.0.1-1.1.noarch.rpm"
RPM_HASH = "efe4e3d31dfce3f1df770daaf96b4c222dd713624b491c16ec3d0125b4000c1cc9a7a1828185fc489def73e5d0761d88f3356550c8e14fb8a8485f3623e4b5a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-radon \
python3.11dist-radon \
python311-radon \
python3dist-radon"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-colorama \
python311-mando \
update-alternatives"

inherit rpm
