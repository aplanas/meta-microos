SUMMARY = "Testing TCP program"
DESCRIPTION = "Test::TCP is a test utility to test TCP/IP-based server programs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.22"

RPM_NAME = "perl-Test-TCP-2.22-1.17.noarch.rpm"
RPM_HASH = "a80426b94ab017c88be442da48df7e4f73848064c1bc99a1c3bccdc148a595c4b549e06c5cec4403402d5a69949616d378ef660ee69f4a65d21354c768567eff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--EmptyPort \
perl-Test--TCP \
perl-Test--TCP--CheckPort \
perl-Test-TCP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-IO--Socket--IP \
perl-Test--SharedFork"

inherit rpm
