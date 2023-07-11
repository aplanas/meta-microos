SUMMARY = "Helpers for building command-line apps"
DESCRIPTION = "CLI Helpers is a Python package for performing common tasks when \
building command-line apps. It's a helper library for command-line interfaces. \
 \
Libraries like Click <http://click.pocoo.org/5/> and Python Prompt \
Toolkit <https://python-prompt-toolkit.readthedocs.io/en/latest/> are \
tools that help to create quality apps. CLI Helpers complements these \
libraries by wrapping up common tasks in interfaces. \
 \
CLI Helpers is not focused on applications' design patterns or \
frameworks -- it can be used it on its own or in combination with \
other libraries."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "python311-cli-helpers-2.3.0-1.6.noarch.rpm"
RPM_HASH = "23db563fa3996f51a98499690bf8bcdea9719ae6d19a6fb48cf082aa1d4d4c851c647da3e77e06eade2ff02bb4595bcd1d869f971fd97a874f675c39949e954a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cli-helpers \
python3.11dist-cli-helpers \
python311-cli-helpers \
python3dist-cli-helpers"

RDEPENDS:${PN} += "python-abi \
python311-Pygments \
python311-configobj \
python311-tabulate \
python311-terminaltables \
python311-wcwidth"

inherit rpm
