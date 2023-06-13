SUMMARY = "Greek"
DESCRIPTION = "Support for Greek."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn65038"

RPM_NAME = "texlive-collection-langgreek-2023.208.svn65038-58.1.noarch.rpm"
RPM_HASH = "84456a7e751aafe62cd03a483dc8bf79962d27596c2517e47a72afa4010e5e0342b323364166f6329a434bbcc192d179565e2e996b1283eb7309e936afd4f045"
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
