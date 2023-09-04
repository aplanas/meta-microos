SUMMARY = "Read and write OLE storage files"
DESCRIPTION = "OLE::Storage_Lite allows you to read and write an OLE structured file. \
 \
OLE::Storage_Lite::PPS is a class representing PPS. \
OLE::Storage_Lite::PPS::Root, OLE::Storage_Lite::PPS::File and \
OLE::Storage_Lite::PPS::Dir are subclasses of OLE::Storage_Lite::PPS."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.22"

RPM_NAME = "perl-OLE-Storage_Lite-0.22-1.3.noarch.rpm"
RPM_HASH = "5740dc5bcbc62fc69c9c98d261c999a3ff337d2d35d9a0d76d8f584bc71766532a68301394bfa5dfae9ba538ff91af56a7630dd5cce7c474e23f0e1e1b9ebd5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-OLE--Storage-Lite \
perl-OLE--Storage-Lite--PPS \
perl-OLE--Storage-Lite--PPS--Dir \
perl-OLE--Storage-Lite--PPS--File \
perl-OLE--Storage-Lite--PPS--Root \
perl-OLE-Storage-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
