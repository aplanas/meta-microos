SUMMARY = "Command Line Interface Formulation Framework - Documentation"
DESCRIPTION = "cliff is a framework for building command line programs. It uses \
setuptools entry points to provide subcommands, output formatters, and \
other extensions. \
 \
This package contains documentation files for python-cliff."
LICENSE = "Apache-2.0"

PV = "3.10.1"

RPM_NAME = "python-cliff-doc-3.10.1-1.7.noarch.rpm"
RPM_HASH = "e08ac22ca96780e99f63335e04f6c26e9113e7a40ac1f6471810701a12a420eee6a11cbe9195895b6ad9c8220e3aa09df9c10a2674de8e2f76dfcfe909d3d672"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-cliff-doc"

RDEPENDS:${PN} += ""

inherit rpm
