SUMMARY = "Stylesheet Generator for PyQt{4-5}/PySide{1-2}"
DESCRIPTION = "A python package designed to help with the construction of PyQt/PySide stylesheets."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python311-qstylizer-0.2.2-1.5.noarch.rpm"
RPM_HASH = "2ce6d3b1ad626bf6cc066190340bf18e75be851e3b30f32f257e8890672589b32f9c16207897611239a5709b69d8bebd046cb71daa1d30304547102fed088858"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qstylizer \
python3.11dist-qstylizer \
python311-qstylizer \
python3dist-qstylizer"

RDEPENDS:${PN} += "python-abi \
python311-inflection \
python311-tinycss2"

inherit rpm
