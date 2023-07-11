SUMMARY = "Python bindings for Selenium"
DESCRIPTION = "Selenium Python Client Driver is a Python language binding for Selenium Remote \
Control (version 1.0 and 2.0). \
 \
Currently, the remote protocol, Firefox and Chrome for Selenium 2.0 are \
supported, as well as the Selenium 1.0 bindings."
LICENSE = "Apache-2.0"

PV = "4.10.0"

RPM_NAME = "python39-selenium-4.10.0-2.1.aarch64.rpm"
RPM_HASH = "ff6d2f39a7760dc5ef56bcf769090ad3b223d6c3501d78cbc88f05d66d6067c5cb93130885accc77f2369855bba7455210e84d9bd7f7d724bb66a905bd02dcf3"

RPROVIDES:${PN} += "python3.9dist-selenium \
python39-selenium \
python3dist-selenium"

RDEPENDS:${PN} += "python-abi \
python39-certifi \
python39-trio \
python39-trio-websocket \
python39-urllib3"

inherit rpm
