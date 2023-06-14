SUMMARY = "Module to make XML working resemble JSON"
DESCRIPTION = "xmltodict is a Python module that makes working with XML feel like you are \
working with json, as in this: \
http://www.xml.com/pub/a/2006/05/31/converting-between-xml-and-json.html"
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python311-xmltodict-0.13.0-2.1.noarch.rpm"
RPM_HASH = "9c11e522b4110ee921d212fe39e3601277ce1f9e0902d8153459f6cff2b19e3ceaeff2f445831636c436c69b3dc97dde5771c589779cc32570891a68cfedeb02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-xmltodict \
python311-xmltodict \
python3dist-xmltodict"

RDEPENDS:${PN} += "python-abi \
python311-xml"

inherit rpm
