SUMMARY = "Module to make XML working resemble JSON"
DESCRIPTION = "xmltodict is a Python module that makes working with XML feel like you are \
working with json, as in this: \
http://www.xml.com/pub/a/2006/05/31/converting-between-xml-and-json.html"
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python310-xmltodict-0.13.0-2.3.noarch.rpm"
RPM_HASH = "45012948a70e3cdb08644e42d1dc30677768b6ce37e5785d2f39c2dbdcf345a58d8a4ded9a98987a03d72bc07b6c4853a0dd8d111a13802a4f7f3674983243f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xmltodict \
python310-xmltodict \
python3dist-xmltodict"

RDEPENDS:${PN} += "python-abi \
python310-xml"

inherit rpm
