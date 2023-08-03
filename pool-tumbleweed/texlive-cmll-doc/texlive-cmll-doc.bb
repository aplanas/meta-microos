SUMMARY = "Documentation for texlive-cmll"
DESCRIPTION = "This package includes the documentation for texlive-cmll"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17964"

RPM_NAME = "texlive-cmll-doc-2023.209.svn17964-54.1.noarch.rpm"
RPM_HASH = "ae2e4295bc95258b8faefb3d0e92451dad416fbfda36bf2b98996d28358e32b5a477858308bec2861f301ff3a6f098b2de2bb8d1212c51b9fb04b5bddbf4706f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmll-doc"

RDEPENDS:${PN} += ""

inherit rpm
