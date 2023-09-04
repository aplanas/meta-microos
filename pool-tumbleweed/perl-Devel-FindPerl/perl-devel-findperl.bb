SUMMARY = "Find the path to your perl"
DESCRIPTION = "This module tries to find the path to the currently running perl. It \
(optionally) exports the following functions:"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.016"

RPM_NAME = "perl-Devel-FindPerl-0.016-1.6.noarch.rpm"
RPM_HASH = "52b23ed915046447489c448dce8888496fb73ed8591af589788772df9515a2f17c339e5ea57d5c49bfa0df2ab7f49f208cfd83644ab8b70bce3b34a8f8d51f01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--FindPerl \
perl-Devel-FindPerl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
