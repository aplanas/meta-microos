SUMMARY = "Replaces actual time with simulated time"
DESCRIPTION = "This module was created to enable test suites to test code at specific \
points in time. Specifically it overrides localtime, gmtime and time at \
compile time and then relies on the user supplying a mock time via \
set_relative_time, set_absolute_time or set_fixed_time to alter future \
calls to gmtime,time or localtime."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.17"

RPM_NAME = "perl-Test-MockTime-0.17-1.19.noarch.rpm"
RPM_HASH = "24f1fd6008d4d4a930aebd603d86b93c438ac2362b1a841fabf5e72c9f6af1967905c4d125160040495d619368f082a8d13e919b93b4838765596b917e2a3e89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--MockTime \
perl-Test-MockTime"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Time--Piece"

inherit rpm
