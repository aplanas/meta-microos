SUMMARY = "ANSI color-code highlighting for Pygments"
DESCRIPTION = "An ANSI color-code highlighting lexer for Pygments."
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python39-pygments-ansi-color-0.3.0-1.1.noarch.rpm"
RPM_HASH = "843a1a03d35937c9bdf5e65e4e676b95f06ec2b189af3f8f790efda77162960802540e43a7077bd2c97de0d57d24e46f0da667283392faae33e527bb10c22468"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pygments-ansi-color \
python39-pygments-ansi-color \
python3dist-pygments-ansi-color"

RDEPENDS:${PN} += "python-abi \
python39-pygments \
python39-setuptools"

inherit rpm
