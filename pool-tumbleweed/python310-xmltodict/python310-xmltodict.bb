SUMMARY = "Module to make XML working resemble JSON"
DESCRIPTION = "xmltodict is a Python module that makes working with XML feel like you are \
working with json, as in this: \
http://www.xml.com/pub/a/2006/05/31/converting-between-xml-and-json.html"
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python310-xmltodict-0.13.0-2.1.noarch.rpm"
RPM_HASH = "d71a688d67deea307eb60bad2181372d477bb29c479e061fb66c272788cb6777185c68a812794cd216e86d72589b3993e5a7fdb7eeba310dc8e884667d3a6fd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xmltodict \
python3.10dist-xmltodict \
python310-xmltodict \
python3dist-xmltodict"

RDEPENDS:${PN} += "python-abi \
python310-xml"

inherit rpm
