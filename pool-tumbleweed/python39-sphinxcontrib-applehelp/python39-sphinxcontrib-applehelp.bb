SUMMARY = "Sphinx extension which outputs Apple help books"
DESCRIPTION = "sphinxcontrib-applehelp is a sphinx extension which outputs Apple help books"
LICENSE = "BSD-2-Clause"

PV = "1.0.4"

RPM_NAME = "python39-sphinxcontrib-applehelp-1.0.4-2.3.noarch.rpm"
RPM_HASH = "77a7df11e1e999f1ee4cefea31fb26d9aa676942f4f2d11dcb7f29a2da0963f86dac554ef17bc136289fbcc545e30f36e1563e43084fbb9c48f24fcac97249a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-applehelp \
python39-sphinxcontrib-applehelp \
python3dist-sphinxcontrib-applehelp"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
