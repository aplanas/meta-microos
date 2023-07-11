SUMMARY = "Flxmlrpc development libraries"
DESCRIPTION = "An implementation of the XMLRPC protocol written in C++, based upon XmlRpc++0.7 \
and modified to provide additional XMLRPC variable types. It is used in \
fldigi, flrig, flnet, flmsg, flarq, flamp, fllog, \
a suite of programs written for amateur radio emergency communications."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.1"

RPM_NAME = "flxmlrpc-devel-1.0.1-1.9.aarch64.rpm"
RPM_HASH = "b4c485def2fbe44cfae0562e1f6a068a3adf3c21b475c3f129aa12f315373d465ebdef66b3e17e020b7f061cd6f438c1fa6bd02d40e313d80b2b06695f33456a"

RPROVIDES:${PN} += "flxmlrpc-devel \
pkgconfig-flxmlrpc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libflxmlrpc1"

inherit rpm
