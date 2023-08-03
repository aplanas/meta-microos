SUMMARY = "Documentation for texlive-fn2end"
DESCRIPTION = "This package includes the documentation for texlive-fn2end"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-fn2end-doc-2023.209.1.1svn15878-53.1.noarch.rpm"
RPM_HASH = "aa15c9f246adb82e8c04452c7bf92f0778fb73b21553dff3be0f3e161f3d69423efafa3408093d590eed686bc0bd7e8f15c0d4d4d092b8f0ee500e4ee1372a0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fn2end-doc"

RDEPENDS:${PN} += ""

inherit rpm
