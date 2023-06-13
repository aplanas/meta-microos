SUMMARY = "Python 3 utility libraries for Ceph CLI"
DESCRIPTION = "This package contains types and routines for Python 3 used by the Ceph CLI as \
well as the RESTful interface. These have to do with querying the daemons for \
command-description information, validating user command input against those \
descriptions, and submitting the command to the appropriate daemon."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "python3-ceph-argparse-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "2a4fa92c5a49764ea7ab7dcc3941d52ee1d27ab4666ff8c93b612d7158f72b68622171a974852964e886b6980c00a0f7c50e3a98e2d5f70e5a9770473806cc06"

RPROVIDES:${PN} += "python3-ceph-argparse \
python3-ceph-argparse(aarch-64)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
