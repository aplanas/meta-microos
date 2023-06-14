SUMMARY = "Development files for htdig"
DESCRIPTION = "The ht://Dig system is a complete World Wide Web index and search \
system for a small domain or intranet. This system is not meant to \
replace the need for powerful Internet-wide search systems like Lycos, \
Infoseek, Webcrawler, or AltaVista. Instead it is meant to cover the \
search needs of a single company, campus, or even a particular \
subsection of a Web site. \
 \
This package is needed if you want to develop other applications on \
htdig."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.0b6"

RPM_NAME = "htdig-devel-3.2.0b6-244.11.aarch64.rpm"
RPM_HASH = "da9581b2e7e738a91c313f29eedd5ba87b35eb13207261507b10b38797b4be463515b61135d40cab2462b27435257a6cd6605b07305a49114142d4ae999f4078"

RPROVIDES:${PN} += "htdig-devel"

RDEPENDS:${PN} += "htdig"

inherit rpm
