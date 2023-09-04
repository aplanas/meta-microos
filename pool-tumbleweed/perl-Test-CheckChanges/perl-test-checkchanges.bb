SUMMARY = "Check that the Changes file matches the distribution."
DESCRIPTION = "This module checks that you _Changes_ file has an entry for the current \
version of the *Module* being tested. \
 \
The version information for the distribution being tested is taken out of \
the Build data, or if that is not found, out of the Makefile. \
 \
It then attempts to open, in order, a file with the name _Changes_ or \
_CHANGES_. \
 \
The _Changes_ file is then parsed for version numbers. If one and only one \
of the version numbers matches the test passes. Otherwise the test fails. \
 \
A message with the current version is printed if the test passes, otherwise \
dialog messages are printed to help explain the failure. \
 \
The _examples_ directory contains examples of the different formats of \
_Changes_ files that are recognized."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.14"

RPM_NAME = "perl-Test-CheckChanges-0.14-16.24.noarch.rpm"
RPM_HASH = "84ecf072ddfe1500be2b16ec5e5adbf973e34b7423cb353fc748aa35078c9a3f1d0f4dbd37a965dd90454845476210aeb1d00cd5fcbbfb7119689d59054718a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--CheckChanges \
perl-Test-CheckChanges"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
