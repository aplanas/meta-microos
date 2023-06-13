SUMMARY = "YaST2 - Reading of systemd journal"
DESCRIPTION = "A YaST2 module to read the systemd journal in a convenient and \
user-friendly way."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-journal-4.6.0-1.1.noarch.rpm"
RPM_HASH = "4510795209b221c190b2f1ecc92fd953441a5dee64315c2296100f0eb7b99aaed3691a8654386fc052d618b609b0e60027dd29bcddc1d50e1685e550287a0a8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.Journal.desktop) \
metainfo() \
metainfo(org.opensuse.yast.Journal.metainfo.xml) \
yast2-journal"

RDEPENDS:${PN} += "yast2 \
yast2-ruby-bindings"

inherit rpm
