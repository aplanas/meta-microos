SUMMARY = "Module to make XML working resemble JSON"
DESCRIPTION = "xmltodict is a Python module that makes working with XML feel like you are \
working with json, as in this: \
http://www.xml.com/pub/a/2006/05/31/converting-between-xml-and-json.html"
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python39-xmltodict-0.13.0-2.1.noarch.rpm"
RPM_HASH = "17d9e0c4a1d876bc50d910a4295925c32ebf4b34749b7c4347dc55eeb95a64fb8b3ce5cb2579f79d291e9f151fcf52ae875a3d24d69a56586d0a85463e0526bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(xmltodict) \
python39-xmltodict \
python3dist(xmltodict)"

RDEPENDS:${PN} += "python(abi) \
python39-xml"

inherit rpm
