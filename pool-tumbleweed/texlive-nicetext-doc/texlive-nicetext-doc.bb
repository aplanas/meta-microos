SUMMARY = "Documentation for texlive-nicetext"
DESCRIPTION = "This package includes the documentation for texlive-nicetext"
LICENSE = "LPPL-1.0"

PV = "2023.209.r0.67svn38914"

RPM_NAME = "texlive-nicetext-doc-2023.209.r0.67svn38914-55.1.noarch.rpm"
RPM_HASH = "9fef7f44fcee9d42e0d12a7b4022f1f717ff487668e8e22d819d0681036a40b7fff23492d4faef8b824067146882057f7f9bd542df4404dc221022d6f9eabb65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nicetext-doc"

RDEPENDS:${PN} += ""

inherit rpm
