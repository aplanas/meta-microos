SUMMARY = "Documentation for texlive-mex"
DESCRIPTION = "This package includes the documentation for texlive-mex"
LICENSE = "SUSE-TeX"

PV = "2023.209.1.05asvn58661"

RPM_NAME = "texlive-mex-doc-2023.209.1.05asvn58661-55.1.noarch.rpm"
RPM_HASH = "5dea2a46df2333913330f0b6889513f5a63b4bec3699872f727a4b78c854151579187a5c1d374e9abbe3e3c93ecba01f313aff1060fc90487894b385f19ce7f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mex-doc"

RDEPENDS:${PN} += ""

inherit rpm
