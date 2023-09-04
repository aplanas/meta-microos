SUMMARY = "Bindings for the OpenStack Compute API"
DESCRIPTION = "This class is an interface to the OpenStack Compute API. Also see the the \
oscompute manpage command line tool."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.1200"

RPM_NAME = "perl-Net-OpenStack-Compute-1.1200-1.24.noarch.rpm"
RPM_HASH = "817589a13af7da8e06e62f88a3bd105b971dcf7a655d8e0e92dfa7bfdb29027b2a7d02457a6f9d97a4f4f8b7632b316fe39a34d6e57a98ec86c479e2321a11a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--OpenStack--Compute \
perl-Net--OpenStack--Compute--AuthRole \
perl-Net-OpenStack-Compute"

RDEPENDS:${PN} += "/usr/bin/env \
perl--MODULE-COMPAT-5.38.0 \
perl-App--Rad \
perl-App--Rad--Plugin--MoreHelp \
perl-HTTP--Request \
perl-JSON \
perl-LWP \
perl-Moose \
perl-Test--Most"

inherit rpm
