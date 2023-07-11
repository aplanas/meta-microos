SUMMARY = "Functions to compare Git versions"
DESCRIPTION = "Git::Version::Compare contains a selection of subroutines that make dealing \
with Git-related things (like versions) a little bit easier. \
 \
The strings to compare can be version numbers, tags from 'git.git' or the \
output of 'git version' or 'git describe'. \
 \
These routines collect the knowledge about Git versions that was \
accumulated while developing Git::Repository."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.005"

RPM_NAME = "perl-Git-Version-Compare-1.005-1.2.noarch.rpm"
RPM_HASH = "d49d8ec0eec6c6fa07e1290d6a0495ae367b7fd3bb8eaf21b877e5ccc5b91d66590bf285bb0609aaae75ed8a7164909517d792c331a82bb70b174f2e8010a800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Git--Version--Compare \
perl-Git-Version-Compare"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
