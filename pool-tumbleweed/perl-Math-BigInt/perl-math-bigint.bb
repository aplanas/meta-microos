SUMMARY = "Arbitrary size integer math package"
DESCRIPTION = "Math::BigInt provides support for arbitrary precision integers. Overloading \
is also provided for Perl operators."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.999839"

RPM_NAME = "perl-Math-BigInt-1.999839-1.1.noarch.rpm"
RPM_HASH = "238b9166879370e204061343a9776e595794a43a56f1bb5ef49d7497e8363a73185935a392ed130ee248695310997c65a612f3a1db4dd30c3daf493448b90f7c"
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
