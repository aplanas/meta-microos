SUMMARY = "Jinja2 pluralize filters"
DESCRIPTION = "Jinja2 pluralize filters."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python311-jinja2-pluralize-0.3.0-2.10.noarch.rpm"
RPM_HASH = "a6394e4c895322d522ab96cb4704114d6d8cbd991e699eb2c9205d8f40da43dc8dafd44fd7d6a73ba28211b9b835b7f68ceaf4ae85bc527f694838d78564e365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jinja2-pluralize \
python3.11dist-jinja2-pluralize \
python311-jinja2-pluralize \
python3dist-jinja2-pluralize"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2 \
python311-inflect"

inherit rpm
