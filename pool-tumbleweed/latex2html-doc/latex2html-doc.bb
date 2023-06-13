SUMMARY = "Documentation for the Latex2HTML Converter"
DESCRIPTION = "This subpackage contains the documentation for the Latex2HTML converter."
LICENSE = "GPL-2.0-or-later & LPPL-1.3c"

PV = "2023"

RPM_NAME = "latex2html-doc-2023-1.2.noarch.rpm"
RPM_HASH = "04d0a243b551e3668d831b0004c0e49b0103bc69e34ffb94f20d22d7cfb44fbaf9d8781c8d253f1146da65130a56a07be43455db79e742a218b0aae3c98260b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "latex2html-doc"

RDEPENDS:${PN} += ""

inherit rpm
