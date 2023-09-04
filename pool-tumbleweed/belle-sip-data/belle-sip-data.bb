SUMMARY = "Belle-sip data files"
DESCRIPTION = "Belle-sip is a SIP (RFC3261) implementation written in C, with an \
object-oriented API. \
 \
This package contains data files such as belr grammar."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.98"

RPM_NAME = "belle-sip-data-5.2.98-1.1.noarch.rpm"
RPM_HASH = "527894bba70a5cd9c6474290834f560294a86d3f776364f61245bffca6fa7e438e78783bd950200ba47f237062aabe1af2efaf28c5a382646e081baa761c002e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "belle-sip-data"

RDEPENDS:${PN} += "libbellesip1"

inherit rpm
