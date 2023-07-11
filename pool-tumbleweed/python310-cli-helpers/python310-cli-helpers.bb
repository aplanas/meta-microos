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

RPM_NAME = "python310-cli-helpers-2.3.0-1.6.noarch.rpm"
RPM_HASH = "8741b87fc212eb7c09a3871e499fd637bf4654b6141a50e98d4a375fe5d15bffad079b666845846f8bbfefb7f8ddd768991605af345b9b4f1a068bca5f0769de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cli-helpers \
python310-cli-helpers \
python3dist-cli-helpers"

RDEPENDS:${PN} += "python-abi \
python310-Pygments \
python310-configobj \
python310-tabulate \
python310-terminaltables \
python310-wcwidth"

inherit rpm
