SUMMARY = "Console colouring for Python"
DESCRIPTION = "termstyle is a Python library for adding coloured output to \
terminal (console) programs.  The definitions come from ECMA-048, the \
'Control Functions for Coded Character Sets' standard."
LICENSE = "BSD-3-Clause"

PV = "0.1.11"

RPM_NAME = "python311-termstyle-0.1.11-7.11.noarch.rpm"
RPM_HASH = "6bc0f5aaaa21efa913f20803e57b7632dbf8f221b0676565d390616fe6226e7defc024c9a56d9b5f2852be77864176e7889ff6c46974dc41d061ea6e6056fd24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-termstyle \
python3-termstyle \
python3.11dist-termstyle \
python311-python-termstyle \
python311-termstyle \
python3dist-termstyle"

RDEPENDS:${PN} += "python-abi"

inherit rpm
