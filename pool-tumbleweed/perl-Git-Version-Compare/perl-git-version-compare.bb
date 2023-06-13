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

RPM_NAME = "perl-Git-Version-Compare-1.005-1.1.noarch.rpm"
RPM_HASH = "38eb9524da647a23bdabd290c63393293abedadffa63be466594eff07d9f3c0868eec1924da519912f712e8a8290d51194046b12c1140e7af3bbf23fc432fd42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Git::Version::Compare) \
perl-Git-Version-Compare"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
