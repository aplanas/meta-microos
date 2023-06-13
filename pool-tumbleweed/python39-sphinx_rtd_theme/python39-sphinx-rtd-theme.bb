SUMMARY = "ReadTheDocs.org theme for Sphinx"
DESCRIPTION = "This is a prototype mobile-friendly sphinx theme I made for readthedocs.org. It's \
currently in development and includes some rtd variable checks that can be ignored \
if you're just trying to use it on your project outside of that site."
LICENSE = "Apache-2.0 & MIT & OFL-1.1"

PV = "1.2.0"

RPM_NAME = "python39-sphinx_rtd_theme-1.2.0-1.1.noarch.rpm"
RPM_HASH = "6c0d81a4bdd48a4be25be98b8fc165a346b12bbb17074445d40951b149515bd1e9c0951a1aaa0ceee050a11daf4da443dfdb3db5b900f3d4019dba69edbfba8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinx-rtd-theme) \
python39-sphinx_rtd_theme \
python3dist(sphinx-rtd-theme)"

RDEPENDS:${PN} += "python(abi) \
python39-Sphinx \
python39-docutils \
python39-sphinxcontrib-jquery"

inherit rpm
