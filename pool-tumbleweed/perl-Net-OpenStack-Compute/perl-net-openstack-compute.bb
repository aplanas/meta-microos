SUMMARY = "Bindings for the OpenStack Compute API"
DESCRIPTION = "This class is an interface to the OpenStack Compute API. Also see the the \
oscompute manpage command line tool."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.1200"

RPM_NAME = "perl-Net-OpenStack-Compute-1.1200-1.23.noarch.rpm"
RPM_HASH = "d984f9bb3a5e27add46c649efc048b1a4b47e86ed047358630a8b8ee90e8e621fbca48887a2ed49abd5e1206216815be498ae630dac933a91d9bede202d9993c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--OpenStack--Compute \
perl-Net--OpenStack--Compute--AuthRole \
perl-Net-OpenStack-Compute"

RDEPENDS:${PN} += "/usr/bin/env \
perl--MODULE-COMPAT-5.36.1 \
perl-App--Rad \
perl-App--Rad--Plugin--MoreHelp \
perl-HTTP--Request \
perl-JSON \
perl-LWP \
perl-Moose \
perl-Test--Most"

inherit rpm
