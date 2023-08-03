SUMMARY = "Templates for TeX usage"
DESCRIPTION = "A set of templates for using LaTeX packages that the author \
uses, comprising: - scrlttr2.tex: a letter, written with \
scrlttr2.cls from the KOMA-Script bundle; - dinbrief.tex: a \
letter according to the German (DIN) standards, written with \
dinbrief.cls; - kbrief.tex: a brief memo ('Kurzbrief') to \
accompany enclosures, as used in German offices, again based on \
dinbrief; - vermerk.tex: a general form for taking down notes \
on events in the office; and - diabetes.tex: a diary for the \
basis-bolus insulin therapy of diabetes mellitus, using \
scrartcl.cls from the KOMA-Script bundle."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-templates-fenn-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "d535ae39129821a50aadd858ca38f574cc110338640b5746d0c1da95ae97262f6f1fc17b8730497081bc990579f59721f30c7c4ec4167a27a3fb063cb1d580aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-templates-fenn"

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
