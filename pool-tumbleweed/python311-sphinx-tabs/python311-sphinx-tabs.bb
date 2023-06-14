SUMMARY = "Tabbed views for Sphinx"
DESCRIPTION = "Create tabbed content in Sphinx documentation when building HTML."
LICENSE = "MIT"

PV = "3.4.1"

RPM_NAME = "python311-sphinx-tabs-3.4.1-1.3.noarch.rpm"
RPM_HASH = "e6a8045790bbd637d0ccf721336bd46caa9c4fa3074febd03fd047682ace7430a5a8444248d5b254a064ce573757dadfe34f9f94090d8fee037b18ec28a09e29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sphinx-tabs \
python311-sphinx-tabs \
python3dist-sphinx-tabs"

RDEPENDS:${PN} += "python-abi \
python311-Pygments \
python311-Sphinx \
python311-docutils"

inherit rpm
