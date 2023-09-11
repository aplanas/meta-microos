SUMMARY = "Sphinx extension which outputs QtHelp"
DESCRIPTION = "sphinxcontrib-qthelp is a sphinx extension which outputs QtHelp document."
LICENSE = "BSD-2-Clause"

PV = "1.0.6"

RPM_NAME = "python39-sphinxcontrib-qthelp-1.0.6-1.1.noarch.rpm"
RPM_HASH = "02ea7e99be511b8da0477d4ac9459855e34d2e24008962e3d71d4b505b693d02e2fe06dea6026ab5d084f8cc43cb277bec941cb65ef88ecd49788f10e710756f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-qthelp \
python39-sphinxcontrib-qthelp \
python3dist-sphinxcontrib-qthelp"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
