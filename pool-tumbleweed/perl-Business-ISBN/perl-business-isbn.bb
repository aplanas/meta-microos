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

RPM_NAME = "perl-Business-ISBN-3.008-1.2.noarch.rpm"
RPM_HASH = "ce438684457622f24431b2ce0970604e905360805acf963fe9210c14d9fb96e87dfe33e2c497967904552f6e4f38d512922b1205767f05294c79bec49313bc44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Business--ISBN \
perl-Business--ISBN10 \
perl-Business--ISBN13 \
perl-Business-ISBN"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Business--ISBN--Data"

inherit rpm
