SUMMARY = "Module to make XML working resemble JSON"
DESCRIPTION = "xmltodict is a Python module that makes working with XML feel like you are \
working with json, as in this: \
http://www.xml.com/pub/a/2006/05/31/converting-between-xml-and-json.html"
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python311-xmltodict-0.13.0-2.3.noarch.rpm"
RPM_HASH = "22dc7b8bf585b747a63e0bebf51c17e0bba7ae0b1ba6a096e1417e1a22ef0892fedacc8b391e3800195649208d42b209b5aa2a4c34c25e36f050e278c6be463e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xmltodict \
python3.11dist-xmltodict \
python311-xmltodict \
python3dist-xmltodict"

RDEPENDS:${PN} += "python-abi \
python311-xml"

inherit rpm
