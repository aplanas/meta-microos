SUMMARY = "Sphinx contrib extension to generate html help files"
DESCRIPTION = "Html help generating extension."
LICENSE = "BSD-2-Clause"

PV = "2.0.4"

RPM_NAME = "python310-sphinxcontrib-htmlhelp-2.0.4-1.1.noarch.rpm"
RPM_HASH = "04c39113fea0ad02c8975a57d01e033b04aad5e0a1dfdd5646e7de1da43d4cb6bfb455b3b04b4970f5fdbd2d77dfd813fa6755580d321e12f921977599cca093"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-htmlhelp \
python310-sphinxcontrib-htmlhelp \
python3dist-sphinxcontrib-htmlhelp"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
