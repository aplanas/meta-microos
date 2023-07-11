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

RPM_NAME = "htdig-doc-3.2.0b6-244.12.aarch64.rpm"
RPM_HASH = "53c0d6a5a4e5933207b0f8dd430503f0da126070cf840e3ffed9decad345953e802d1dfc8313065d58ac1756b3f8941e74114e51d40dcd7bdf72a2e87808f76e"

RPROVIDES:${PN} += "htdig-doc"

RDEPENDS:${PN} += "htdig"

inherit rpm
