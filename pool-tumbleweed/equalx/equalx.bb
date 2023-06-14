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

RPM_NAME = "equalx-0.7.1-8.16.aarch64.rpm"
RPM_HASH = "a65ceff053bd3793a9d45a6764cafea7a7ef2ae8483e857ac24e62661d37dc4dcb1f76302facea1a51ab81110b905edf3879b1027f956745fce46791d2de71b8"

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
