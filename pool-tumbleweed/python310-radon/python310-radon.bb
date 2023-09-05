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

RPM_NAME = "python310-radon-6.0.1-1.1.noarch.rpm"
RPM_HASH = "2b5b37c3287dae71e3e70dcf82da34b05a09a9a5bb5a6c04dc6426db181cda5ed8d9ea8c409b13697a88c7f810090ed428476461b843e25559a65863b2a3ed82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-radon \
python310-radon \
python3dist-radon"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-colorama \
python310-mando \
update-alternatives"

inherit rpm
