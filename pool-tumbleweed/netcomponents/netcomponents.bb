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

RPM_NAME = "netcomponents-1.3.8-301.6.noarch.rpm"
RPM_HASH = "b131916bb68c3862634f3a5eee47882363b49101df607531d6646bfec95d1271dbfbd8cd8ce7a7483cdbe47f7dd3df424ea41111c0f4d6f9f4c1d7b2d456a954"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcomponents"

RDEPENDS:${PN} += ""

inherit rpm
