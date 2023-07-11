SUMMARY = "Greek"
DESCRIPTION = "Support for Greek."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn65038"

RPM_NAME = "texlive-collection-langgreek-2023.208.svn65038-60.1.noarch.rpm"
RPM_HASH = "6beb1218492971a13f3dfadccde873a0431d7d73df4da86ef2414cfd6f6aaaa8e9ba3bed9141c3c50d3442bffd3dc83aeecc13f6822acdd3895b5ed2b1371760"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langgreek"

RDEPENDS:${PN} += "texlive-babel-greek \
texlive-begingreek \
texlive-betababel \
texlive-cbfonts \
texlive-cbfonts-fd \
texlive-collection-basic \
texlive-gfsbaskerville \
texlive-gfsporson \
texlive-greek-fontenc \
texlive-greek-inputenc \
texlive-greekdates \
texlive-greektex \
texlive-greektonoi \
texlive-hyphen-ancientgreek \
texlive-hyphen-greek \
texlive-ibycus-babel \
texlive-ibygrk \
texlive-kerkis \
texlive-levy \
texlive-lgreek \
texlive-lgrmath \
texlive-mkgrkindex \
texlive-talos \
texlive-teubner \
texlive-xgreek \
texlive-yannisgr"

inherit rpm
