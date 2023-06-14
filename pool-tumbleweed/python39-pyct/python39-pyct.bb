SUMMARY = "Python package for common tasks for users"
DESCRIPTION = "A utility package that includes: \
 \
  1. pyct.cmd: Makes various commands available to other \
     packages. (Currently no sophisticated plugin system, just a try \
     import/except in the other packages.) The same commands are \
     available from within python. Can either add new subcommands to \
     an existing argparse based command if the module has an existing \
     command, or create the entire command if the module has no \
     existing command. Currently, there are commands for copying \
     examples and fetching data. See \
 \
  2. pyct.build: Provides various commands to help package \
     building, primarily as a convenience for project maintainers."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python39-pyct-0.5.0-1.3.noarch.rpm"
RPM_HASH = "4fdae7dabe571508a9ecdc08a3c8f2b9346fa3c7836fa47204e227c0b6ee7497c6dfb8083f268ffdad8088532062d42110cf30a807401c3ca509dda36c29f1d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyct \
python39-pyct \
python3dist-pyct"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-PyYAML \
python39-param \
python39-requests \
update-alternatives"

inherit rpm
