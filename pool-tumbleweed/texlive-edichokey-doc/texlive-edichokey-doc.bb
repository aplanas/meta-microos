SUMMARY = "Documentation for texlive-edichokey"
DESCRIPTION = "This package includes the documentation for texlive-edichokey"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.01ysvn56223"

RPM_NAME = "texlive-edichokey-doc-2023.201.2.01ysvn56223-53.2.noarch.rpm"
RPM_HASH = "9a68fc21596363fbe2b397ae4ecddb2d989c393403f5323019b159aec6eed44251f207e3bfb4db4e50f998b3c0ce400a24eccde420295eaf32a60c11f850fe35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-edichokey-doc"

RDEPENDS:${PN} += ""

inherit rpm
