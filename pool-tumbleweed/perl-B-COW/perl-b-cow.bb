SUMMARY = "B::COW additional B helpers to check COW status"
DESCRIPTION = "B::COW provides some naive additional B helpers to check the COW status of \
one SvPV."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.007"

RPM_NAME = "perl-B-COW-0.007-1.4.aarch64.rpm"
RPM_HASH = "5797cf684c38a1c2619989aa1f703704805f4b4b1da587d64ca9689b3af3d6aa9d085edbd97160d3e5dc01294a4431c3017d50cbc4b8d54fb00dfeb905fe539d"

RPROVIDES:${PN} += "perl-B--COW \
perl-B-COW"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
