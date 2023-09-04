SUMMARY = "Conversion between math formats"
DESCRIPTION = "The texmath library provides functions to read and write TeX math, presentation \
MathML, and OMML (Office Math Markup Language, used in Microsoft Office). \
Support is also included for converting math formats to Gnu eqn, typst, and \
pandoc's native format (allowing conversion, via pandoc, to a variety of \
different markup formats). The TeX reader supports basic LaTeX and AMS \
extensions, and it can parse and apply LaTeX macros. (See \
<https://johnmacfarlane.net/texmath here> for a live demo of bidirectional \
conversion between LaTeX and MathML.) \
 \
The package also includes several utility modules which may be useful for \
anyone looking to manipulate either TeX math or MathML. For example, a copy of \
the MathML operator dictionary is included. \
 \
Use the 'executable' flag to install a standalone executable, 'texmath', that \
converts formulas from one format to another. (Use the '--help' flag for a \
description of all functionality). \
 \
Use the 'server' flag to install a web server, 'texmath-server', that exposes a \
JSON API allowing conversion of individual formulas and batches of formulas."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.8"

RPM_NAME = "texmath-0.12.8-2.1.aarch64.rpm"
RPM_HASH = "861501ba6d4c2af552dadf44e2d9575786759ec6b46a15b4721185b402f869c7f9d145fe0ad9ab2da649b8dc83fa1f5f76bab91515887dea9823b10898b4e850"

RPROVIDES:${PN} += "texmath"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
