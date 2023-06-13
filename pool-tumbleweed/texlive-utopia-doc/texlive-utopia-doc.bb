SUMMARY = "Documentation for texlive-utopia"
DESCRIPTION = "This package includes the documentation for texlive-utopia"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-utopia-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "f6fe775b4d01aa6c2e756277eb2d91400e07c9e36ebe5e6cbab914c43c7eb4703087eb7654da46c542a55907915033aa2e3f11e80ea3354fc111b569c001af2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-utopia-doc"

RDEPENDS:${PN} += ""

inherit rpm
