SUMMARY = "Common files for pybugz"
DESCRIPTION = "PyBugz is a python and command line interface to Bugzilla. \
 \
It was conceived as a tool to speed up the workflow for Gentoo Linux \
developers and contributors when dealing with bugs using Bugzilla. By \
avoiding the clunky web interface, the user quickly search, isolate and \
contribute to the project very quickly. Developers alike can easily extract \
attachments and close bugs all from the comfort of the command line. \
 \
This package contains common files for pybugz."
LICENSE = "GPL-2.0-only"

PV = "0.13"

RPM_NAME = "pybugz-common-0.13-3.9.noarch.rpm"
RPM_HASH = "2c425d65b09a2965c10559785b59020d802cc6737e604b71918718b4ad9915ae6dc654716ff4179e5ae2aa715278790c22dda6ffdc2260c61a0603fa2f3e885a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pybugz-common"
RDEPENDS:${PN} += ""

inherit rpm
