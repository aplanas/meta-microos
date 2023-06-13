SUMMARY = "Javadoc for netcomponents"
DESCRIPTION = "NetComponents, is an Internet protocol suite Java library originally \
developed by ORO, Inc.	This version supports Finger, Whois, TFTP, \
Telnet, POP3, FTP, NNTP, SMTP, and some miscellaneous protocols like \
Time and Echo as well as BSD R command support.  The purpose of the \
library is to provide fundamental protocol access, not higher-level \
abstractions.  Therefore, some of the design violates object-oriented \
design principles.  Our philosophy is to make the global functionality \
of a protocal accesible (e.g., TFTP send file and receive file) when \
possible, but also provide access to the fundamental protocols where \
applicable so that the programmer may construct his own custom \
implementations (e.g, the TFTP packet classes and the TFTP packet send \
and receive methods are exposed). \
 \
This package contains the javadoc documentation for netcomponents."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.8"

RPM_NAME = "netcomponents-javadoc-1.3.8-301.6.noarch.rpm"
RPM_HASH = "220eb3ce547acee79882d8d6717f8d50f9e75ff824fe296213eeeb1f12aee8206f245fe69d3b54e371f441fac75490e73060221deae25e940ca5486876893e4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcomponents-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
