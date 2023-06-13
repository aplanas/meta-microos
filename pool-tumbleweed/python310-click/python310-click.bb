SUMMARY = "A wrapper around optparse for command line utilities"
DESCRIPTION = "Click is a Python package for creating command line interfaces \
in a composable way with as little code as necessary.  It's the 'Command \
Line Interface Creation Kit'. It is configurable, and comes with \
defaults out of the box."
LICENSE = "BSD-3-Clause"

PV = "8.1.3"

RPM_NAME = "python310-click-8.1.3-4.1.noarch.rpm"
RPM_HASH = "f6f90137f55e3331c7b22efbf9fddc0420227562f09caa2f927503d4edba209735c07b76fc3283d079e5f1e6584e6d50acd91c45a79765e989e183194960723f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click \
python3.10dist(click) \
python310-click \
python3dist(click)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
