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

RPM_NAME = "perl-File-DesktopEntry-0.22-1.25.noarch.rpm"
RPM_HASH = "fdc0d63d1b20d6cfb0faafaed52a52394f3844a78c6e999f3710c76d75abd0970de855d584eb5c9584012ec71cc3faa3d71fe3c2b9a8025b06741afe32565d3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(File::DesktopEntry) \
perl-File-DesktopEntry"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(File::BaseDir) \
perl(URI::Escape)"

inherit rpm
