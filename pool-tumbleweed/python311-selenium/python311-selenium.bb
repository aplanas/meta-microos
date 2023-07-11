SUMMARY = "Python bindings for Selenium"
DESCRIPTION = "Selenium Python Client Driver is a Python language binding for Selenium Remote \
Control (version 1.0 and 2.0). \
 \
Currently, the remote protocol, Firefox and Chrome for Selenium 2.0 are \
supported, as well as the Selenium 1.0 bindings."
LICENSE = "Apache-2.0"

PV = "4.10.0"

RPM_NAME = "python311-selenium-4.10.0-2.1.aarch64.rpm"
RPM_HASH = "687ba18739f03bd5cad676c8f09ac46de46946814800c2433187ee66248b1d04cb190df570820944eda174be621ebe1e9475af73bcada4edbd63d418d943a752"

RPROVIDES:${PN} += "python3-selenium \
python3.11dist-selenium \
python311-selenium \
python3dist-selenium"

RDEPENDS:${PN} += "python-abi \
python311-certifi \
python311-trio \
python311-trio-websocket \
python311-urllib3"

inherit rpm
