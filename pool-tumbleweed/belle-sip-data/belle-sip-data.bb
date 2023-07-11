SUMMARY = "Belle-sip data files"
DESCRIPTION = "Belle-sip is a SIP (RFC3261) implementation written in C, with an \
object-oriented API. \
 \
This package contains data files such as belr grammar."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.73"

RPM_NAME = "belle-sip-data-5.2.73-1.1.noarch.rpm"
RPM_HASH = "82fef99a7c97597eb4c320375e7555d9f2adaffd185f361beb7f946978f61d31c0514db2c40ff0226ec40ffde69823f5494ab7e5f06d59bee991e43cb6597245"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "belle-sip-data"

RDEPENDS:${PN} += "libbellesip1"

inherit rpm
