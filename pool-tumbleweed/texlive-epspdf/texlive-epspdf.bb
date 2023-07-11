SUMMARY = "Converter for PostScript, EPS and PDF"
DESCRIPTION = "Epspdftk.tcl is a GUI ps/eps/pdf converter. Epspdf.tlu, its \
command-line backend, can be used by itself. Options include \
grayscaling, cropping margins and single-page selection. Some \
conversion options are made possible by converting in multiple \
steps."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.6.5.1svn66115"

RPM_NAME = "texlive-epspdf-2023.201.0.0.6.5.1svn66115-53.2.noarch.rpm"
RPM_HASH = "815555713e20fc82ce0c987b00052b1a5bf3609d40e2ec94831549cdc99103943192ae43f75c207d87b6a50f9c374cb320970905c51a33afc426e10c58524222"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epspdf"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
/usr/bin/wish \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-epspdf-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
