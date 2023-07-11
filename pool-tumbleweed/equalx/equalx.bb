SUMMARY = "Editor for writing and exporting TeX/LaTeX equations"
DESCRIPTION = "EqualX is a helpful graphical interface to LaTeX programs. \
It gives you the power and beauty for writing TeX/LaTeX equations \
in a simple to use editor. \
 \
Features included: \
* Highlight find results in the Equation Preview; \
* 3 modes for Refreshing the Preview \
* Customise the export commands \
* Professional & customisable window layout \
* Equation font is computed according to desktop DPI \
* Reshaping the Symbols toolbar and Templates toolbar"
LICENSE = "GPL-3.0-or-later"

PV = "0.7.1"

RPM_NAME = "equalx-0.7.1-8.17.aarch64.rpm"
RPM_HASH = "386566668a4bc9927e342c27a3b4b8712b7aac356926a9a86ea0bef92eb0fddedfed37a6427731e1ab49b52b284087929afcaf99c7bada2ba4137020412e57d1"

RPROVIDES:${PN} += "equalx"

RDEPENDS:${PN} += "ghostscript \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libexempi.so.8 \
libgcc-s.so.1 \
libstdc++.so.6 \
poppler-tools \
texlive-latex"

inherit rpm
