SUMMARY = "Merge text in TeX and LaTeX"
DESCRIPTION = "Repetetively produce documents from a fixed part and a variable \
part. Such an operation is commonly used as 'mail merge' to \
produce mail shots."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.01svn20677"

RPM_NAME = "texlive-textmerg-2023.209.2.01svn20677-55.1.noarch.rpm"
RPM_HASH = "b997b237e85ed6246d35c33b29613398d33bc40f9b26f0a6c0df26cef024cdccc5defab614ea24839870eb974bada2602045083170a518828cd0197de60848d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-textmerg.sty \
texlive-textmerg"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
