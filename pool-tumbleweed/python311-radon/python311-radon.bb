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

RPM_NAME = "python311-radon-5.1.0-1.4.noarch.rpm"
RPM_HASH = "2ca13ae9745cd7c2cb729306ae07a693c27b0554bfa8b5b596aaca3bde3b21461176457d7e001b450e9908f3653b480a4091dea7d595389ef9d76c3d140ff5e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(radon) \
python311-radon \
python3dist(radon)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-colorama \
python311-future \
python311-mando \
update-alternatives"

inherit rpm
