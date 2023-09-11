SUMMARY = "Sphinx extension which outputs Apple help books"
DESCRIPTION = "sphinxcontrib-applehelp is a sphinx extension which outputs Apple help books"
LICENSE = "BSD-2-Clause"

PV = "1.0.7"

RPM_NAME = "python39-sphinxcontrib-applehelp-1.0.7-1.1.noarch.rpm"
RPM_HASH = "0060ffde0107e01b9916c9ebfa10d5e5c23be09c6da0a87815997a61f7dfaba5fd72d62149672a88af30b70110262da1225f0d764d62f86b1d97033b24303c0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-applehelp \
python39-sphinxcontrib-applehelp \
python3dist-sphinxcontrib-applehelp"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
