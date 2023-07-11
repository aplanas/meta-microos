SUMMARY = "Console colouring for Python"
DESCRIPTION = "termstyle is a Python library for adding coloured output to \
terminal (console) programs.  The definitions come from ECMA-048, the \
'Control Functions for Coded Character Sets' standard."
LICENSE = "BSD-3-Clause"

PV = "0.1.11"

RPM_NAME = "python39-termstyle-0.1.11-7.11.noarch.rpm"
RPM_HASH = "1e2d4723b3f8ed070ed3fbc7c4cb5868f7ad0df427f163b2b80c967bb92d4b89ae9d728c8a6136c49028c757a38fa98602a86b92b1c915c9048c489ff3060c82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-termstyle \
python39-python-termstyle \
python39-termstyle \
python3dist-termstyle"

RDEPENDS:${PN} += "python-abi"

inherit rpm
