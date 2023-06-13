SUMMARY = "Read and write OLE storage files"
DESCRIPTION = "OLE::Storage_Lite allows you to read and write an OLE structured file. \
 \
OLE::Storage_Lite::PPS is a class representing PPS. \
OLE::Storage_Lite::PPS::Root, OLE::Storage_Lite::PPS::File and \
OLE::Storage_Lite::PPS::Dir are subclasses of OLE::Storage_Lite::PPS."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.22"

RPM_NAME = "perl-OLE-Storage_Lite-0.22-1.1.noarch.rpm"
RPM_HASH = "41062cc9cb514f7fc749855ea005c79b273b22f05c44fcb9ffff8b00bc712c672e453ce4592469f77bcf9a45df9c2efcf50c851d0bc77720a7bc8456ee0dd869"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(OLE::Storage_Lite) \
perl(OLE::Storage_Lite::PPS) \
perl(OLE::Storage_Lite::PPS::Dir) \
perl(OLE::Storage_Lite::PPS::File) \
perl(OLE::Storage_Lite::PPS::Root) \
perl-OLE-Storage_Lite"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
