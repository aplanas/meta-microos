SUMMARY = "Cover letter for journal submissions"
DESCRIPTION = "Paper submissions to journals are usually accompanied by a \
cover letter. This package provides a LaTeX class and a \
template for such a cover letter with the following main \
features: Minimalistic design. Custom image. Pre-defined \
commands for journal name, author, date, etc. Many macros \
contained in this package speed up the process of preparing the \
necessary ingredients for the cover letter. Macros for \
recommending up to three reviewers and/or editors. ORCID logo \
and link to the submitting author's ORCID page. Controls for \
adding a 'Conflict of interest' statement and declaration. \
Custom greeting (e.g., 'Dear Editor' for a regular submission, \
'Dear Editor-in-Chief' for a submission to a journal's special \
issue, etc.) Predefined valedictions for different types of \
submissions (e.g., Yours sincerely, Yours faithfully, Best \
regards, etc.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65290"

RPM_NAME = "texlive-jourcl-2023.201.svn65290-55.1.noarch.rpm"
RPM_HASH = "a3e9ead53675abec3c021a5e2eff6e1335f2ea477302e6263b7c290c27721d6a45765d7984c174734fd3c4643f02a150a146a12c13d16502f8631b56450b6eb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(jourcl.cls) \
texlive-jourcl"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(article.cls) \
tex(babel.sty) \
tex(fancyhdr.sty) \
tex(fontawesome5.sty) \
tex(framed.sty) \
tex(graphicx.sty) \
tex(inputenc.sty) \
tex(isodate.sty) \
tex(lipsum.sty) \
tex(orcidlink.sty) \
tex(parskip.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
