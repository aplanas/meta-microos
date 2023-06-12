SUMMARY = "Belle-sip data files"
DESCRIPTION = "Belle-sip is a SIP (RFC3261) implementation written in C, with an \
object-oriented API. \
 \
This package contains data files such as belr grammar."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.49"

RPM_NAME = "belle-sip-data-5.2.49-1.1.noarch.rpm"
RPM_HASH = "b3c111896e824998d8ef004962e6f4f64e95791793eb344717fb215e670aec96aabb3a173ac81297a58230bcf1f5a8e635bd92854bfa498cf1154d4c558c5e0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "belle-sip-data"
RDEPENDS:${PN} += "libbellesip1"

inherit rpm
