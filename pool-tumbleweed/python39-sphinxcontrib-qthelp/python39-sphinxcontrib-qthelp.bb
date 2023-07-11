SUMMARY = "Sphinx extension which outputs QtHelp"
DESCRIPTION = "sphinxcontrib-qthelp is a sphinx extension which outputs QtHelp document."
LICENSE = "BSD-2-Clause"

PV = "1.0.3"

RPM_NAME = "python39-sphinxcontrib-qthelp-1.0.3-3.2.noarch.rpm"
RPM_HASH = "52adc58b055e2bde66aa2276fd11b0dbbe7176b72d44953aa857ca2cdd72b92c55e3f3f67954e2a196bb757181301698b703a07471e26541439519db060ec6f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-qthelp \
python39-sphinxcontrib-qthelp \
python3dist-sphinxcontrib-qthelp"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
