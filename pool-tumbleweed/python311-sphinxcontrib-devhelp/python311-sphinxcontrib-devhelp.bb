SUMMARY = "Sphinx extension which outputs Devhelp documents"
DESCRIPTION = "sphinxcontrib-devhelp is a sphinx extension which outputs Devhelp document."
LICENSE = "BSD-2-Clause"

PV = "1.0.2"

RPM_NAME = "python311-sphinxcontrib-devhelp-1.0.2-2.1.noarch.rpm"
RPM_HASH = "5cd9bd84c67d7a8e059d73ff2e03af70a05a0ea584e18cca393e1f5e44faba7bf88dbf1f414aa964fef77cc1e9ded10c8574bb87b87b3b82c422a347035eff07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinxcontrib-devhelp) \
python311-sphinxcontrib-devhelp \
python3dist(sphinxcontrib-devhelp)"

RDEPENDS:${PN} += "python(abi) \
python311-Sphinx"

inherit rpm
