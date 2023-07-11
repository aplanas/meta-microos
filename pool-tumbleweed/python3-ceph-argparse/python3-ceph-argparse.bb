SUMMARY = "Python 3 utility libraries for Ceph CLI"
DESCRIPTION = "This package contains types and routines for Python 3 used by the Ceph CLI as \
well as the RESTful interface. These have to do with querying the daemons for \
command-description information, validating user command input against those \
descriptions, and submitting the command to the appropriate daemon."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "python3-ceph-argparse-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "41317e6d848ec60da405a5708d96122def67a8d5ff41de519d25f3401c913df6fc0ab7be4b1fe75030d3f6cf96769a565a81f08e7871adebcf2e44f1b79b150b"

RPROVIDES:${PN} += "python3-ceph-argparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
