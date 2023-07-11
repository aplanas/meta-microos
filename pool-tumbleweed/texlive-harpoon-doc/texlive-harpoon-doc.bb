SUMMARY = "Documentation for texlive-harpoon"
DESCRIPTION = "This package includes the documentation for texlive-harpoon"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn21327"

RPM_NAME = "texlive-harpoon-doc-2023.201.1.0svn21327-53.2.noarch.rpm"
RPM_HASH = "11fdbfacc3873c88280bca578cb7389a1da1d380cc3185642b545d685b6dc981d1f9965462933245cb004edea2b8473682348bdda96539b6727a1fdea21ed486"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harpoon-doc"

RDEPENDS:${PN} += ""

inherit rpm
