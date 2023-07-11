SUMMARY = "Jinja2 pluralize filters"
DESCRIPTION = "Jinja2 pluralize filters."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python310-jinja2-pluralize-0.3.0-2.10.noarch.rpm"
RPM_HASH = "29d7462b923daab50dca437f238a4324db70b96119d7c7715ebfb331f48ca4c359b39d27d64142c174033e1cba896b6355f858b48af5927fd2d3226c31daaf22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jinja2-pluralize \
python310-jinja2-pluralize \
python3dist-jinja2-pluralize"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-inflect"

inherit rpm
