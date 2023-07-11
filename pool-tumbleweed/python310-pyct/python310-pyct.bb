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

RPM_NAME = "python310-pyct-0.5.0-1.5.noarch.rpm"
RPM_HASH = "e80ff737b56955dca46d318c647da8bd590864f87406004c51ffcf8fa56ca14475292335f13948fc4ac06219586245606a3c0fd0b1e721f1d45d5e28b12956b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyct \
python310-pyct \
python3dist-pyct"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-param \
python310-requests \
update-alternatives"

inherit rpm
