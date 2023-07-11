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

RPM_NAME = "perl-File-DesktopEntry-0.22-1.26.noarch.rpm"
RPM_HASH = "cec58cd10dbe5959da98a96b5e3ce6c6ef4ffca57abe12fd0a829f48d2259af9abe002521bec1ed8576b8644ef9a3585ecdc734cfd110c973b38bb2c36dfe59b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--DesktopEntry \
perl-File-DesktopEntry"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-File--BaseDir \
perl-URI--Escape"

inherit rpm
