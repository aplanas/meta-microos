SUMMARY = "Work with International Standard Book Numbers"
DESCRIPTION = "This modules handles International Standard Book Numbers, including ISBN-10 \
and ISBN-13. \
 \
The data come from Business::ISBN::Data, which means you can update the \
data separately from the code. Also, you can use Business::ISBN::Data with \
whatever _RangeMessage.xml_ you like if you have updated data. See that \
module for details."
LICENSE = "Artistic-2.0"

PV = "3.008"

RPM_NAME = "perl-Business-ISBN-3.008-1.1.noarch.rpm"
RPM_HASH = "0d2a71528fed22f2f33d7976629869d7b918ac0d6633e554c2ff6f564109cbd5c6111c215752ef1a70354a828be67b6579d6fa9a8dd368336a5411fce1979dcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Business--ISBN \
perl-Business--ISBN10 \
perl-Business--ISBN13 \
perl-Business-ISBN"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Business--ISBN--Data"

inherit rpm
