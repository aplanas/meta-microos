SUMMARY = "Binary files of texfot"
DESCRIPTION = "Binary files of texfot"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn33155"

RPM_NAME = "texlive-texfot-bin-2023.20230311.svn33155-93.2.aarch64.rpm"
RPM_HASH = "ba1d30e5eea604ebaeeffad42597e5e1ee4de5a2b82db58aa5f5a7c4dadb5e8e6342b9ff354f8b6af232e60e2cd47cfc97d056578c5b740eb6164863046727d4"

RPROVIDES:${PN} += "texlive-texfot-bin"

RDEPENDS:${PN} += "texlive-texfot"

inherit rpm
