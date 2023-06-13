SUMMARY = "Python bindings for Selenium"
DESCRIPTION = "Selenium Python Client Driver is a Python language binding for Selenium Remote \
Control (version 1.0 and 2.0). \
 \
Currently, the remote protocol, Firefox and Chrome for Selenium 2.0 are \
supported, as well as the Selenium 1.0 bindings."
LICENSE = "Apache-2.0"

PV = "3.141.0"

RPM_NAME = "python39-selenium-3.141.0-3.11.aarch64.rpm"
RPM_HASH = "75fe7a0f8609c2de3bff0c3d86db43e49df8b0333b1f26c1279df4de688df82a451c69761d834fe6112b0aec0d19e3020a7dabc8aaddd4cd380bc87eaedd13f3"

RPROVIDES:${PN} += "python3.9dist(selenium) \
python39-selenium \
python39-selenium(aarch-64) \
python3dist(selenium)"

RDEPENDS:${PN} += "python(abi) \
python39-rdflib \
python39-urllib3"

inherit rpm
