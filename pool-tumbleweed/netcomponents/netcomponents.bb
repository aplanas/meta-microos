SUMMARY = "Internet Protocol Suite Java Library"
DESCRIPTION = "NetComponents is an Internet protocol suite Java library originally \
developed by ORO, Inc.	This version supports Finger, Whois, TFTP, \
Telnet, POP3, FTP, NNTP, SMTP, and some miscellaneous protocols like \
Time and Echo as well as BSD R command support.  The purpose of the \
library is to provide fundamental protocol access, not higher-level \
abstractions.  Therefore, some of the design violates object-oriented \
design principles.  Its philosophy is to make the global functionality \
of a protocal accesible (for example, TFTP send file and receive file) \
when possible, but also provide access to the fundamental protocols \
where applicable so that the programmer can construct custom \
implementations (for example, the TFTP packet classes and the TFTP \
packet send and receive methods are exposed)."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.8"

RPM_NAME = "netcomponents-1.3.8-301.7.noarch.rpm"
RPM_HASH = "1d3608201b30d1d48ecd2d7abb03c5a5de9a4f844ef1bc88bc8aafd3353a04c7f86e8fca5a1d51cf6ac608e19fa5f59f9222a12d308fd6cbf98944c8a5a75f27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcomponents"

RDEPENDS:${PN} += ""

inherit rpm
