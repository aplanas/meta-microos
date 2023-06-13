SUMMARY = "Command Line Interface Formulation Framework"
DESCRIPTION = "cliff is a framework for building command line programs. It uses \
setuptools entry points to provide subcommands, output formatters, and \
other extensions. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "3.10.1"

RPM_NAME = "python3-cliff-3.10.1-1.6.noarch.rpm"
RPM_HASH = "db23b7171aa85ccbbfc44522f530fef89f97840ae1f6fe6ea9d17769b383554241a2ecef7dfa541d75b02fdc5b1fe317fbf4f7e695d82c83e5b78c2eaa3e0e78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cliff \
python3.10dist(cliff) \
python3dist(cliff)"

RDEPENDS:${PN} += "python(abi) \
python3-PrettyTable \
python3-PyYAML \
python3-autopage \
python3-cmd2 \
python3-pyparsing \
python3-stevedore"

inherit rpm
