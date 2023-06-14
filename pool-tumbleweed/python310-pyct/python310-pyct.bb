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

RPM_NAME = "python310-pyct-0.5.0-1.3.noarch.rpm"
RPM_HASH = "a97e4bdc2c241261d7128322843f3d2f558b84bac7613453c65ee1e6a33f3291641e448b7fe634d5b9c9ea3f453248e58cf6901740c356ef09611d857c9d9a4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyct \
python3.10dist-pyct \
python310-pyct \
python3dist-pyct"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-PyYAML \
python310-param \
python310-requests \
update-alternatives"

inherit rpm
