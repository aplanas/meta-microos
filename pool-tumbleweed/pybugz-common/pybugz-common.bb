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

RPM_NAME = "pybugz-common-0.13-3.10.noarch.rpm"
RPM_HASH = "5dd9f7c83babd169b862d72f6b90c1da428b90c208a304f8e86194e1f5f68982a6236464ad5529f02836403a346e13ac93467eee6d2fbdc9499d4f23e1ec2484"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pybugz-common"

RDEPENDS:${PN} += ""

inherit rpm
