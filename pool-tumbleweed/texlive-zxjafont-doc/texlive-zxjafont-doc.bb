SUMMARY = "Documentation for texlive-zxjafont"
DESCRIPTION = "This package includes the documentation for texlive-zxjafont"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn62864"

RPM_NAME = "texlive-zxjafont-doc-2023.201.1.3svn62864-52.1.noarch.rpm"
RPM_HASH = "ecc2715037cf56675a7e61023481d843215d7b544a2dcdf20bc3f523cb9049f8a8ce1ffc501a21f52b13b89ff6a446c91394c75bd318139b9de51eb893b23a49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-zxjafont-doc:ja;en) \
texlive-zxjafont-doc"

RDEPENDS:${PN} += ""

inherit rpm
