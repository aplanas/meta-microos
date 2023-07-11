SUMMARY = "Read and write OLE storage files"
DESCRIPTION = "OLE::Storage_Lite allows you to read and write an OLE structured file. \
 \
OLE::Storage_Lite::PPS is a class representing PPS. \
OLE::Storage_Lite::PPS::Root, OLE::Storage_Lite::PPS::File and \
OLE::Storage_Lite::PPS::Dir are subclasses of OLE::Storage_Lite::PPS."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.22"

RPM_NAME = "perl-OLE-Storage_Lite-0.22-1.2.noarch.rpm"
RPM_HASH = "f472a51247bfc0baccc2a3864741f72f9ede245295b83a08159cbfd0bce39529888444b15dd8ec791e0960b12f7f249196700396917b366ee3dd14df44045988"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-OLE--Storage-Lite \
perl-OLE--Storage-Lite--PPS \
perl-OLE--Storage-Lite--PPS--Dir \
perl-OLE--Storage-Lite--PPS--File \
perl-OLE--Storage-Lite--PPS--Root \
perl-OLE-Storage-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
