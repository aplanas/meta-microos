SUMMARY = "Temporary changing working directory (chdir)"
DESCRIPTION = "CORE::chdir Cwd:: Guard can change the current directory (chdir) using a \
limited scope."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.05"

RPM_NAME = "perl-Cwd-Guard-0.05-1.22.noarch.rpm"
RPM_HASH = "ef38bd6dc666b80a075c8ac072c614cab276f1f60d515a8ddba27491294fe326c9d262263b578afc5c98cac6961875bf66f220bd2ad2f1495625f0555970b5f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Cwd--Guard \
perl-Cwd-Guard"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-parent"

inherit rpm
