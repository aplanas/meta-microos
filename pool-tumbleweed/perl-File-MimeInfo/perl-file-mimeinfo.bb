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

RPM_NAME = "perl-File-MimeInfo-0.33-1.4.noarch.rpm"
RPM_HASH = "cdae432b14c765baf013edcb9fcd952934b70488c9a8aa084f6b8a35dc2f85c638bff14bdd844d846b14ac2507d23edd933058bf527d98c3bdde32cc5c071b1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--MimeInfo \
perl-File--MimeInfo--Applications \
perl-File--MimeInfo--Magic \
perl-File--MimeInfo--Rox \
perl-File-MimeInfo"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-Encode--Locale \
perl-File--BaseDir \
perl-File--DesktopEntry \
shared-mime-info"

inherit rpm
