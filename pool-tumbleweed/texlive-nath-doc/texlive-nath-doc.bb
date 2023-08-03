SUMMARY = "Documentation for texlive-nath"
DESCRIPTION = "This package includes the documentation for texlive-nath"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-nath-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "2db7928f33993149ebaba92e4b96ffd9c64ca767cb9262f0d978464cd22e87b174f06ffce86bae32ac939e64ae1a4d8021a542ad3293d26dbbcea8531db07836"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nath-doc"

RDEPENDS:${PN} += ""

inherit rpm
