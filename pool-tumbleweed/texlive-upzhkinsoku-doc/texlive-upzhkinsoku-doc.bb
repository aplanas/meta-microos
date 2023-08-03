SUMMARY = "Documentation for texlive-upzhkinsoku"
DESCRIPTION = "This package includes the documentation for texlive-upzhkinsoku"
LICENSE = "SUSE-TeX"

PV = "2023.209.0.0.5svn47354"

RPM_NAME = "texlive-upzhkinsoku-doc-2023.209.0.0.5svn47354-54.1.noarch.rpm"
RPM_HASH = "d50ea02a3bb8e836527963e8038f9165e8ceecc16277188630693797014f308aecfe78806595cd0a17d58f6f44c813174ba20f996a272e6ae983aacdb583bcda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-upzhkinsoku-doc"

RDEPENDS:${PN} += ""

inherit rpm
