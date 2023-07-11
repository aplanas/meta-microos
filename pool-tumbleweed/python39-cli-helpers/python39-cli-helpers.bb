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

RPM_NAME = "python39-cli-helpers-2.3.0-1.6.noarch.rpm"
RPM_HASH = "70872756ba823f71ad0f8d0b72732c04721b6e1dafc37a71189365a8e3f5689b3cf43b28c4b1f9751dba809731572d33cd30cd9437c4c0a10b0b5871e6b4ce34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cli-helpers \
python39-cli-helpers \
python3dist-cli-helpers"

RDEPENDS:${PN} += "python-abi \
python39-Pygments \
python39-configobj \
python39-tabulate \
python39-terminaltables \
python39-wcwidth"

inherit rpm
