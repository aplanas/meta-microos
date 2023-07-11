SUMMARY = "Arbitrary size integer math package"
DESCRIPTION = "Math::BigInt provides support for arbitrary precision integers. Overloading \
is also provided for Perl operators."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.999838"

RPM_NAME = "perl-Math-BigInt-1.999838-1.2.noarch.rpm"
RPM_HASH = "47f4a8fd5eb6199b6cd5449406826e767e52e347b5256edb222ea49af2c9b86d4581537277f870c28d641653e5e06be2428adb069a7807ae5ff5672017db3de2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Math--BigFloat \
perl-Math--BigInt \
perl-Math--BigInt--Calc \
perl-Math--BigInt--Lib \
perl-Math-BigInt"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Carp \
perl-Math--Complex"

inherit rpm
