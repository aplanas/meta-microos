SUMMARY = "Testing TCP program"
DESCRIPTION = "Test::TCP is a test utility to test TCP/IP-based server programs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.22"

RPM_NAME = "perl-Test-TCP-2.22-1.16.noarch.rpm"
RPM_HASH = "d9fb89c465799ed39d945468cebf63363cee3174d2272eb01d81ddae23004ea6c508f068049d52473f418925c3241affffbd1a8f5d41bf595f89737cd10d7f65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--EmptyPort \
perl-Test--TCP \
perl-Test--TCP--CheckPort \
perl-Test-TCP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-IO--Socket--IP \
perl-Test--SharedFork"

inherit rpm
