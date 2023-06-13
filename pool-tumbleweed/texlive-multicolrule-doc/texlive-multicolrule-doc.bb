SUMMARY = "Documentation for texlive-multicolrule"
DESCRIPTION = "This package includes the documentation for texlive-multicolrule"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3asvn56366"

RPM_NAME = "texlive-multicolrule-doc-2023.201.1.3asvn56366-54.1.noarch.rpm"
RPM_HASH = "df86aef1502269ed84d1e09c28b4f65988c2600f60b0e4d18109ff341cb8d5bad25de16983b8944b5326923cdc85a272e7e705c469df924782fd8658f752b5ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multicolrule-doc"

RDEPENDS:${PN} += ""

inherit rpm
