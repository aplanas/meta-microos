SUMMARY = "Jinja2 pluralize filters"
DESCRIPTION = "Jinja2 pluralize filters."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python39-jinja2-pluralize-0.3.0-2.10.noarch.rpm"
RPM_HASH = "0a38c3f11732384534148bcb0f8d61fc873a4a490f72fcd19373c41b5a542ffd9f6b7b0dd4a061fca4e68c6bdfe58ffed114d10acd7b93e9887d39fb626e2ca2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jinja2-pluralize \
python39-jinja2-pluralize \
python3dist-jinja2-pluralize"

RDEPENDS:${PN} += "python-abi \
python39-Jinja2 \
python39-inflect"

inherit rpm
