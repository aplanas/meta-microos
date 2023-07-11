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

RPM_NAME = "netcomponents-javadoc-1.3.8-301.7.noarch.rpm"
RPM_HASH = "88d3ac02e8ddfb8b0662cd5b8cef03308958813d9d4c0744708e2114e6c8308a38fd671aebad1cb9f3ca50a9bf241617f8f1a6ab101a2f5215220c78ec5fb508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netcomponents-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
