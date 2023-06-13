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

RPM_NAME = "python310-radon-5.1.0-1.4.noarch.rpm"
RPM_HASH = "6574463db1a71175507ad2c3d4996de2b92eb9178e996e43d100904bb988920958f0e8d5b3df2d904c962f175d23af7934851b84150a01f3162d33b30f48b603"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-radon \
python3.10dist(radon) \
python310-radon \
python3dist(radon)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-colorama \
python310-future \
python310-mando \
update-alternatives"

inherit rpm
