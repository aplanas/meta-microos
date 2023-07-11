SUMMARY = "Python bindings for Selenium"
DESCRIPTION = "Selenium Python Client Driver is a Python language binding for Selenium Remote \
Control (version 1.0 and 2.0). \
 \
Currently, the remote protocol, Firefox and Chrome for Selenium 2.0 are \
supported, as well as the Selenium 1.0 bindings."
LICENSE = "Apache-2.0"

PV = "4.10.0"

RPM_NAME = "python310-selenium-4.10.0-2.1.aarch64.rpm"
RPM_HASH = "7ab7cac40c4874cbc041c85334801a959e5be5f8406d24af58206cd90a92c7c8d7cbe82c96e3ade8865560c34e47f20eeb0ae967b12230c490ab71cef7205e79"

RPROVIDES:${PN} += "python3.10dist-selenium \
python310-selenium \
python3dist-selenium"

RDEPENDS:${PN} += "python-abi \
python310-certifi \
python310-trio \
python310-trio-websocket \
python310-urllib3"

inherit rpm
