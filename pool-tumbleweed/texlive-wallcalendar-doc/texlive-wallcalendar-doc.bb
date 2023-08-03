SUMMARY = "Documentation for texlive-wallcalendar"
DESCRIPTION = "This package includes the documentation for texlive-wallcalendar"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.1svn45568"

RPM_NAME = "texlive-wallcalendar-doc-2023.209.1.3.1svn45568-54.1.noarch.rpm"
RPM_HASH = "8ac2a70fb09891c634baa19e09db25efabf59a98d8e8bba3cb587ac05e762bc4540f7c7a8ff06a060bfd7de14dbecb69cf9c4e66a55905f4e634c3f65ccd8141"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wallcalendar-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
