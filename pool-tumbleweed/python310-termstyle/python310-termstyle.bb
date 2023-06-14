SUMMARY = "Console colouring for Python"
DESCRIPTION = "termstyle is a Python library for adding coloured output to \
terminal (console) programs.  The definitions come from ECMA-048, the \
'Control Functions for Coded Character Sets' standard."
LICENSE = "BSD-3-Clause"

PV = "0.1.11"

RPM_NAME = "python310-termstyle-0.1.11-7.10.noarch.rpm"
RPM_HASH = "4ef25fa4c8e3f950e072b9feec5b9ccaf763bd19d2a3602bdf417e52d2dedb0d28a26615cb8906449345342b65892c2b637de60dee9fd2c13d4ced75c5871577"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-termstyle \
python3-termstyle \
python3.10dist-termstyle \
python310-python-termstyle \
python310-termstyle \
python3dist-termstyle"

RDEPENDS:${PN} += "python-abi"

inherit rpm
