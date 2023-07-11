SUMMARY = "Documentation for the Latex2HTML Converter"
DESCRIPTION = "This subpackage contains the documentation for the Latex2HTML converter."
LICENSE = "GPL-2.0-or-later & LPPL-1.3c"

PV = "2023"

RPM_NAME = "latex2html-doc-2023-1.3.noarch.rpm"
RPM_HASH = "a2834710ba2f3fceb74a73e62128e8c0bcd85aefd931f74fc25ed80da84e33a110a025399a593d4621b2720929e9d27008894977b3db29054671e6b4dba33091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "latex2html-doc"

RDEPENDS:${PN} += ""

inherit rpm
