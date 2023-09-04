SUMMARY = "Object to handle .desktop files"
DESCRIPTION = "This module is designed to work with _.desktop_ files. The format of these \
files is specified by the freedesktop 'Desktop Entry' specification. This \
module can parse these files but also knows how to run the applications \
defined by these files. \
 \
For this module version 1.0 of the specification was used. \
 \
This module was written to support File::MimeInfo::Applications. \
 \
Please remember: case is significant for the names of Desktop Entry keys."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.22"

RPM_NAME = "perl-File-DesktopEntry-0.22-1.27.noarch.rpm"
RPM_HASH = "efa9ec84053415acf206ec506ff15486cf3a63511aa7b62e8898bc30dca8f48fa47df35a45b6964c5d44f2c8152db8b66c9b00408a3b3c0b8e68a074b0996566"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--DesktopEntry \
perl-File-DesktopEntry"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-File--BaseDir \
perl-URI--Escape"

inherit rpm
