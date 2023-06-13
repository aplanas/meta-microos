SUMMARY = "Python bindings for Selenium"
DESCRIPTION = "Selenium Python Client Driver is a Python language binding for Selenium Remote \
Control (version 1.0 and 2.0). \
 \
Currently, the remote protocol, Firefox and Chrome for Selenium 2.0 are \
supported, as well as the Selenium 1.0 bindings."
LICENSE = "Apache-2.0"

PV = "3.141.0"

RPM_NAME = "python311-selenium-3.141.0-3.11.aarch64.rpm"
RPM_HASH = "e32db93fccb75787e3285af644c266eec6f00fc4e58803171e900e0ff8bdcce1e015135004319607332a344b8d165b3ba7865fd11d2f83c3599d3138e24fe0ca"

RPROVIDES:${PN} += "python3.11dist(selenium) \
python311-selenium \
python311-selenium(aarch-64) \
python3dist(selenium)"

RDEPENDS:${PN} += "python(abi) \
python311-rdflib \
python311-urllib3"

inherit rpm
