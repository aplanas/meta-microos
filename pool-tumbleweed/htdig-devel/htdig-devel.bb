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

RPM_NAME = "htdig-devel-3.2.0b6-244.12.aarch64.rpm"
RPM_HASH = "7371de4d81cf409944dab84fd7966c1d5908ebdd2089a73492d4539ebf55c182cb1c084cae60fef3cb190a89f8373aeee8ce61a1e04bd0a76d498a1e52d15c16"

RPROVIDES:${PN} += "htdig-devel"

RDEPENDS:${PN} += "htdig"

inherit rpm
