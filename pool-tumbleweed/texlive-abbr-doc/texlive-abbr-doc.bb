SUMMARY = "Documentation for texlive-abbr"
DESCRIPTION = "This package includes the documentation for texlive-abbr"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-abbr-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "34f6d7406f703b806318e74fed740d6b711808d55ca7b236eb53ae530456b9389987f3b3d36be9b79f1d61941a41fe7738fd9722c1c6b7072cc847aca6eb9796"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-abbr-doc"

RDEPENDS:${PN} += ""

inherit rpm
