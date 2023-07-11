SUMMARY = "Console colouring for Python"
DESCRIPTION = "termstyle is a Python library for adding coloured output to \
terminal (console) programs.  The definitions come from ECMA-048, the \
'Control Functions for Coded Character Sets' standard."
LICENSE = "BSD-3-Clause"

PV = "0.1.11"

RPM_NAME = "python310-termstyle-0.1.11-7.11.noarch.rpm"
RPM_HASH = "0a071e418b395d34c42abaa23fe7a44ac8419692fefe6f896bb96c4623b639113e36b930f564a182203099ed811ffffbd9998be2df7de38a39eb853d2b4acfef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-termstyle \
python310-python-termstyle \
python310-termstyle \
python3dist-termstyle"

RDEPENDS:${PN} += "python-abi"

inherit rpm
