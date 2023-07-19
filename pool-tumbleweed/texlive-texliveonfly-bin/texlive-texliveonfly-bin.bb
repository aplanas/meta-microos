SUMMARY = "Binary files of texliveonfly"
DESCRIPTION = "Binary files of texliveonfly"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn24062"

RPM_NAME = "texlive-texliveonfly-bin-2023.20230311.svn24062-93.1.aarch64.rpm"
RPM_HASH = "515a71659c2868407c7b3e094e46b738349fece85aff1454a37c59dea4638830ccd542679036d5d8fd266cf5eefcaaab337b8aed405969001bcda64a64a78393"

RPROVIDES:${PN} += "texlive-texliveonfly-bin"

RDEPENDS:${PN} += "texlive-texliveonfly"

inherit rpm
