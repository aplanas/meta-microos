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

RPM_NAME = "perl-Business-ISBN-3.008-1.3.noarch.rpm"
RPM_HASH = "91ab26be5390099f168a66ae3657d6d2b9c231b46b9027e6560c794a684141f7c5f574b5e8be22a8df18d62c34667c04de973e77f00e73ba0b05b6b7ba5843ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Business--ISBN \
perl-Business--ISBN10 \
perl-Business--ISBN13 \
perl-Business-ISBN"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Business--ISBN--Data"

inherit rpm
