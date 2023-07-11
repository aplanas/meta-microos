SUMMARY = "HTML documentation for jupyter"
DESCRIPTION = "Documentation and help files for jupyter."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "jupyter-doc-1.0.0-12.2.noarch.rpm"
RPM_HASH = "f550dbaa08f20cda0b6746df5c5a1110f06547d0e331e3c71a13cfbf053e0ba6cda0a786f17a95c61155f9bf653e4e78601650fad3e12caa41dbc79a9201615e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-doc \
jupyter-doc-html \
jupyter-doc-pdf \
python310-jupyter-doc \
python310-jupyter-doc-html \
python310-jupyter-doc-pdf \
python311-jupyter-doc \
python311-jupyter-doc-html \
python311-jupyter-doc-pdf \
python39-jupyter-doc \
python39-jupyter-doc-html \
python39-jupyter-doc-pdf"

RDEPENDS:${PN} += ""

inherit rpm
