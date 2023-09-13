SUMMARY = "Development libraries for multipath-tools"
DESCRIPTION = "This package contains the development libraries for multipath-tools \
and libmpathpersist."
LICENSE = "GPL-2.0-only & LGPL-2.0-or-later"

PV = "0.9.6+71+suse.f07325e"

RPM_NAME = "multipath-tools-devel-0.9.6+71+suse.f07325e-1.1.aarch64.rpm"
RPM_HASH = "ac74557283b4caa4c7448eb64f7113e63b796a6968c8afab15054258654228a5c3757cb6e208df927c5be735482dab2154894270824669b1955ae4e15d0db012"

RPROVIDES:${PN} += "multipath-tools-devel"

RDEPENDS:${PN} += "libmpath0"

inherit rpm
