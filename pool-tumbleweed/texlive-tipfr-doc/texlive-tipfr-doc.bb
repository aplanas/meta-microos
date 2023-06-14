SUMMARY = "Documentation for texlive-tipfr"
DESCRIPTION = "This package includes the documentation for texlive-tipfr"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn38646"

RPM_NAME = "texlive-tipfr-doc-2023.201.1.5svn38646-52.1.noarch.rpm"
RPM_HASH = "9da71dc5ca431bae97cebca26474539ffffb6288d3d0808fa5728573d75bd134d39c90aa5aeeede03883eda78a2c2aacedc29413568ca73dc4f59e0941757768"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tipfr-doc-fr \
texlive-tipfr-doc"

RDEPENDS:${PN} += ""

inherit rpm
