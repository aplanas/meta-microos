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

RPM_NAME = "python39-radon-5.1.0-2.3.noarch.rpm"
RPM_HASH = "5972b041db0a2ffb0f7676a870bdc4afaed081c5b3ad4e7315cc8fe4462047e1a253f73e5ae1c352401b40cdf75308a91462757c9f81fc845e1e6dbfb65a2a41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-radon \
python39-radon \
python3dist-radon"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-colorama \
python39-future \
python39-mando \
update-alternatives"

inherit rpm
