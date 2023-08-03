SUMMARY = "Bibliographic style file for Biomedical Journals"
DESCRIPTION = "This BibTeX style file is generated with the docstrip utility \
and modified manually to meet the Uniform Requirements for \
Manuscripts Submitted to Biomedical Journals as published in N \
Engl J Med 1997;336:309-315 (also known as the Vancouver \
style). The complete set of requirements may be viewed on the \
ICMJE web site."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn59192"

RPM_NAME = "texlive-vancouver-2023.209.1.0svn59192-54.1.noarch.rpm"
RPM_HASH = "1324df47da26ad904aa9a1c789a75706adf0e0dc018927cf9cc7f6901ed1fb1f3ca7a6b0d49f5113748014b528c28fabd5bfc44bf76456038ba859ac0a3e0455"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vancouver"

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
