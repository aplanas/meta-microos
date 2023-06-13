SUMMARY = "Determine file types"
DESCRIPTION = "This module can be used to determine the mime type of a file. It tries to \
implement the freedesktop specification for a shared MIME database. \
 \
For this module shared-mime-info-spec 0.13 was used. \
 \
This package only uses the globs file. No real magic checking is used. The \
File::MimeInfo::Magic package is provided for magic typing. \
 \
If you want to determine the mimetype of data in a memory buffer you should \
use File::MimeInfo::Magic in combination with IO::Scalar. \
 \
This module loads the various data files when needed. If you want to hash \
data earlier see the 'rehash' methods below."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.33"

RPM_NAME = "perl-File-MimeInfo-0.33-1.3.noarch.rpm"
RPM_HASH = "d205f8fbdc5403e4a7ff8f587475fa1b3dc48f08411c96d409b7443a4fddab8285fb65d5516d7228b3c99f0312cde6745f4f3702be850c6ec5acc880aec1e39a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(File::MimeInfo) \
perl(File::MimeInfo::Applications) \
perl(File::MimeInfo::Magic) \
perl(File::MimeInfo::Rox) \
perl-File-MimeInfo"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(Encode::Locale) \
perl(File::BaseDir) \
perl(File::DesktopEntry) \
shared-mime-info"

inherit rpm
