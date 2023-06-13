SUMMARY = "Jinja2 pluralize filters"
DESCRIPTION = "Jinja2 pluralize filters."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python39-jinja2-pluralize-0.3.0-2.8.noarch.rpm"
RPM_HASH = "c9790c3a092a48336faeab4fb28d0063ab657a8f06cc7172e397ae10fb3890cbdd0308f28c501a8b841d8d2776d7fee1405c501717338f431abedfb8a74410f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jinja2-pluralize) \
python39-jinja2-pluralize \
python3dist(jinja2-pluralize)"

RDEPENDS:${PN} += "python(abi) \
python39-Jinja2 \
python39-inflect"

inherit rpm
