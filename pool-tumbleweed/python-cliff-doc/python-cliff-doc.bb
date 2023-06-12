SUMMARY = "Command Line Interface Formulation Framework - Documentation"
DESCRIPTION = "cliff is a framework for building command line programs. It uses \
setuptools entry points to provide subcommands, output formatters, and \
other extensions. \
 \
This package contains documentation files for python-cliff."
LICENSE = "Apache-2.0"

PV = "3.10.1"

RPM_NAME = "python-cliff-doc-3.10.1-1.6.noarch.rpm"
RPM_HASH = "a8c0ec62bb637cea8510fcb945f8f830872017d0ebc581b1585716ba17618ea95f701167b3d866cc4595b0ce031a69697170429873d533c07bfbd5a516ae06d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-cliff-doc"
RDEPENDS:${PN} += ""

inherit rpm
