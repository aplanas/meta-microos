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

RPM_NAME = "python311-pyct-0.5.0-1.5.noarch.rpm"
RPM_HASH = "48af6c3c0875ccaeaaa3efd4414d91c308f24f8e64e9be0673ea5e8fd18b0063b53b1e92dae3ceb641336676f2b24696014fb9926e39c830a436ca2390ce1bc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyct \
python3.11dist-pyct \
python311-pyct \
python3dist-pyct"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-param \
python311-requests \
update-alternatives"

inherit rpm
