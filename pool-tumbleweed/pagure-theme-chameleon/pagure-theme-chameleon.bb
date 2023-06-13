SUMMARY = "Pagure web interface theme based on openSUSE's chameleon theme"
DESCRIPTION = "This package provides the web interface assets for styling \
a Pagure server with the same look and feel as openSUSE Infrastructure."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-theme-chameleon-5.13.3-1.4.noarch.rpm"
RPM_HASH = "d4bd3c608d91867f94a7feb4c8bdbdf0499f9f23cb1cbfe4ecbe7c89bdcdeff20147c649e6f416e0202c458217acc015aeb7c0d2b528f2ebb7e831e5464a6fbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-theme-chameleon"

RDEPENDS:${PN} += "pagure"

inherit rpm
