SUMMARY = "Documentation for texlive-suftesi"
DESCRIPTION = "This package includes the documentation for texlive-suftesi"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2.0svn60991"

RPM_NAME = "texlive-suftesi-doc-2023.201.3.2.0svn60991-57.1.noarch.rpm"
RPM_HASH = "2999f9b90ff3e31f0b21ef39ba6f8fbb0a52a9b50829de354b094e246314b20d6d7ffd1065a858146b02e5387d83b0b2680f9b93013ad92fca531e356beff7c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-suftesi-doc:en) \
texlive-suftesi-doc"
RDEPENDS:${PN} += ""

inherit rpm
