SUMMARY = "Mail and News Server"
DESCRIPTION = "Software to set up electronic mail and message services to handle email, mailing, and news lists, including a virus scanner to scan messages at the server level."
LICENSE = "MIT"

PV = "20210330"

RPM_NAME = "patterns-server-mail_server-20210330-5.1.aarch64.rpm"
RPM_HASH = "c162d19c15ad4199160b2030a98aa39cf438064cbbd9faf28569b652a52f7c9091b6d58f99d1d52e3fce16e361edd916dda95fd299b1b356071bf0a6884402b4"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-openSUSE-mail-server \
patterns-server-mail-server"

RDEPENDS:${PN} += "pattern- \
vacation"

inherit rpm
