SUMMARY = "Documentation for python-Flask"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-Flask."
LICENSE = "BSD-3-Clause"

PV = "2.3.2"

RPM_NAME = "python311-Flask-doc-2.3.2-1.1.noarch.rpm"
RPM_HASH = "248bd53ffac314cd5db468e6cada562c290184b345137cb500ac34ba104e0a2d3c98a584b57c731b048f60481d6fc3a2265fa02f9f583fe48729de668a9bed26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-doc \
python311-Flask-doc"

RDEPENDS:${PN} += "python311-Flask"

inherit rpm
