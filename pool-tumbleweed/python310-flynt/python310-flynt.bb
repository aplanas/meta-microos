SUMMARY = "CLI tool to convert a python project's  strings to f-strings"
DESCRIPTION = "CLI tool to convert a python project's  strings to f-strings."
LICENSE = "MIT"

PV = "0.78"

RPM_NAME = "python310-flynt-0.78-1.1.noarch.rpm"
RPM_HASH = "9355675a042a061e4e983602f2bc9bbfc057aea9a401d3bc3e2c8ec6f18aaf73ff03ffbd7cbf3369b91c479736c10b203a283d6a2a0302a1c50c6afa31a4860e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flynt \
python310-flynt \
python3dist-flynt"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-astor \
python310-tomli"

inherit rpm
