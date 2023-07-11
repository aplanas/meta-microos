SUMMARY = "Program used to verify the code of your python project"
DESCRIPTION = "Inspektor is a program used to verify the code of a Python project. \
It checks code with the help of pylint, checks indentation with \
pycodestyle, and checks for PEP8 compliance. \
 \
Inspektor can work with Git and SVN checkouts."
LICENSE = "GPL-2.0-only"

PV = "0.5.2"

RPM_NAME = "python3-inspektor-0.5.2-2.9.noarch.rpm"
RPM_HASH = "2779f3aa2e714f9f52c7781244462a8ce9af944cdf51663ca7338d3f4ef0ad3e535c5cf751b83a883456b34a6949363afe7319babb0297ebf25e5fdaf875471b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-inspektor \
python3.11dist-inspektor \
python3dist-inspektor"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-astroid \
python3-cliff \
python3-cmd2 \
python3-logutils \
python3-pbr \
python3-pycodestyle \
python3-pylint \
python3-stevedore \
python3-typed-ast \
update-alternatives"

inherit rpm
