SUMMARY = "WWW Index and Search System Documentation"
DESCRIPTION = "The ht://Dig system is a complete World Wide Web index and search \
system for a small domain or intranet. This system is not meant to \
replace the need for powerful Internet-wide search systems like Lycos, \
Infoseek, Webcrawler, or AltaVista. Instead it is meant to cover the \
search needs of a single company, campus, or even a particular \
subsection of a Web site. \
 \
This package provides additional documentation for htdig in \
/usr/share/doc/packages/htdig/"
LICENSE = "GPL-2.0-or-later"

PV = "3.2.0b6"

RPM_NAME = "htdig-doc-3.2.0b6-244.11.aarch64.rpm"
RPM_HASH = "10d1c8c55c30283644d8cc68b84438ce4d8b2f1bad7c9243c5357bed95b71d3d2c10c62d9bc1858ff75acfdd173f6de361eae2c9947a4af60cb7c684dd8dea80"

RPROVIDES:${PN} += "htdig-doc \
htdig-doc(aarch-64)"
RDEPENDS:${PN} += "htdig"

inherit rpm
