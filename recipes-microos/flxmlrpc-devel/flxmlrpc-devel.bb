SUMMARY = "Flxmlrpc development libraries"
DESCRIPTION = "An implementation of the XMLRPC protocol written in C++, based upon XmlRpc++0.7 \
and modified to provide additional XMLRPC variable types. It is used in \
fldigi, flrig, flnet, flmsg, flarq, flamp, fllog, \
a suite of programs written for amateur radio emergency communications."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.1"

RPM_NAME = "flxmlrpc-devel-1.0.1-1.8.aarch64.rpm"
RPM_HASH = "13327bcea23ec7c4b552a9973f3f9df8d71db98262f79cc222b4ec3a537fdcf33538cd030198c759ecd8f4d4e8a712774b0959dfe9d8ddd735b48dfdf010b438"

RPROVIDES:${PN} += "flxmlrpc-devel flxmlrpc-devel(aarch-64) pkgconfig(flxmlrpc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libflxmlrpc1"

inherit rpm
