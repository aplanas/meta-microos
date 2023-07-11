SUMMARY = "Command Line Interface Formulation Framework"
DESCRIPTION = "cliff is a framework for building command line programs. It uses \
setuptools entry points to provide subcommands, output formatters, and \
other extensions. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "3.10.1"

RPM_NAME = "python3-cliff-3.10.1-1.7.noarch.rpm"
RPM_HASH = "ce5bd8307f293e2f39c7f09136164a2234e1a1391886647bff106db9d866b2d7f1803fcc58b510ccf1cb367071d6e41257145a7c42dd4f8bcdd2c36cc34a6337"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cliff \
python3.11dist-cliff \
python3dist-cliff"

RDEPENDS:${PN} += "python-abi \
python3-PrettyTable \
python3-PyYAML \
python3-autopage \
python3-cmd2 \
python3-pyparsing \
python3-stevedore"

inherit rpm
