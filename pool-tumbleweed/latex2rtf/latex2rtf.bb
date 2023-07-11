SUMMARY = "LaTeX to RTF Converter"
DESCRIPTION = "LaTeX2RTF is a translator program to convert LaTeX formatted text files into \
“rich text format” (RTF) files. RTF is a published standard format by Microsoft. \
This standard can be ambiguous in places, but RTF is supported by many text \
editors. Specifically, it is supported by Microsoft Word. This means that the \
conversion of a LaTeX document to RTF allows anyone with a copy of Word to \
ponvert LaTeX files to Word .doc or .docx files."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.18a"

RPM_NAME = "latex2rtf-2.3.18a-1.12.aarch64.rpm"
RPM_HASH = "ea9c73c84e8d3934d798bdf171e1abc7488617399565bc64e40dc75efb8bea0317180837a14867d68cb1196ecfd7684f684a0f551fa367125ebdcf1d25c605c7"

RPROVIDES:${PN} += "latex2rtf"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ImageMagick \
libc.so.6 \
libm.so.6 \
netpbm \
texlive-scheme-basic"

inherit rpm
