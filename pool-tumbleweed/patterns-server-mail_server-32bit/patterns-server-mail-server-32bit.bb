SUMMARY = "Mail and News Server"
DESCRIPTION = "The 32bit pattern complementing mail_server."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-mail_server-32bit-20210330-5.1.aarch64.rpm"
RPM_HASH = "2800a4ec8de228bc4d7b672ae127d55a45703c28203fe8dbee6591df057964e58cfebec8f0e63baf235572bdf1f5cb9e2d04b634d614b33c5fd93022dfc89bc1"

RPROVIDES:${PN} += "pattern() \
patterns-server-mail_server-32bit \
patterns-server-mail_server-32bit(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
