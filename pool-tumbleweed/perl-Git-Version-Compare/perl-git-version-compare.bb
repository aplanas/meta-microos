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

RPM_NAME = "perl-Git-Version-Compare-1.005-1.3.noarch.rpm"
RPM_HASH = "30c505a5194d5afe4fc2c73691ce9d61f07f847257e62f28b7cae2cafde97607ae4ecb6a829fe8f591c600f1ebee7c93de95e93777d705362a46674686ff11ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Git--Version--Compare \
perl-Git-Version-Compare"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
