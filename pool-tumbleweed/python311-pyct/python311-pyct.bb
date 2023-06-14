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

RPM_NAME = "python311-pyct-0.5.0-1.3.noarch.rpm"
RPM_HASH = "0227cdbfd6d3edc4e7ca55e3bb145ba63739dd5d89d9a534bac03e0c45c5dcfa47b33a9f4ae3440ae08bfdb06b8f78f44eed6afb8f89458c5abbee30db9259b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pyct \
python311-pyct \
python3dist-pyct"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-PyYAML \
python311-param \
python311-requests \
update-alternatives"

inherit rpm
