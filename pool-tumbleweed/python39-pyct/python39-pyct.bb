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

RPM_NAME = "python39-pyct-0.5.0-1.5.noarch.rpm"
RPM_HASH = "25b85ed9e7519bcb39c24799d1e0f9ec398468cefa43cdf413a85afa5238859ff2ec813dcb3cbafb174781e7c347c67da5f94b2f62c18c25588ca3f07b4858d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyct \
python39-pyct \
python3dist-pyct"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-param \
python39-requests \
update-alternatives"

inherit rpm
