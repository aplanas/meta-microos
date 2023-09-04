SUMMARY = "Python 3 utility libraries for Ceph CLI"
DESCRIPTION = "This package contains types and routines for Python 3 used by the Ceph CLI as \
well as the RESTful interface. These have to do with querying the daemons for \
command-description information, validating user command input against those \
descriptions, and submitting the command to the appropriate daemon."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "python3-ceph-argparse-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "3956f1248e15af3ee29f15af13746d76f00a7c93b90cae0c9374f666a740e35bf18d9e44a88167f5499421eec23bc7b3411f808851b9a2dda8113ee39db1e13a"

RPROVIDES:${PN} += "python3-ceph-argparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
