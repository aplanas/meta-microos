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

RPM_NAME = "perl-Test-CheckChanges-0.14-16.23.noarch.rpm"
RPM_HASH = "835353ea8178b11a33e87bb4d15489a8018240bff776f7e0b7943e37154c8e724c7d7aa9fac8e408b463867a1c17ca0c603ecf771889371a27f725ca346798da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--CheckChanges \
perl-Test-CheckChanges"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
