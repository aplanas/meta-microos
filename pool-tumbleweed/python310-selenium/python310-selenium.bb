SUMMARY = "Python bindings for Selenium"
DESCRIPTION = "Selenium Python Client Driver is a Python language binding for Selenium Remote \
Control (version 1.0 and 2.0). \
 \
Currently, the remote protocol, Firefox and Chrome for Selenium 2.0 are \
supported, as well as the Selenium 1.0 bindings."
LICENSE = "Apache-2.0"

PV = "3.141.0"

RPM_NAME = "python310-selenium-3.141.0-3.11.aarch64.rpm"
RPM_HASH = "bb9ef563776050a3e476b3bd30d788633d46cc0e518994c8b25d876eadca4a1b001e637fe1b74bf08fd08ed430793470a2a9b8ac50672ce25301d8493470b95e"

RPROVIDES:${PN} += "python3-selenium \
python3.10dist-selenium \
python310-selenium \
python3dist-selenium"

RDEPENDS:${PN} += "python-abi \
python310-rdflib \
python310-urllib3"

inherit rpm
