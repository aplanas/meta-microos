SUMMARY = "Module to make XML working resemble JSON"
DESCRIPTION = "xmltodict is a Python module that makes working with XML feel like you are \
working with json, as in this: \
http://www.xml.com/pub/a/2006/05/31/converting-between-xml-and-json.html"
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python39-xmltodict-0.13.0-2.3.noarch.rpm"
RPM_HASH = "bfcea4db786b4f526fb27e43c563c1fc29def02882e34e7b6a02902296c230370a9aebcec0bc7eada98b9bb4917c028f96d5374c25ecd3cfcdf68eac91764f77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xmltodict \
python39-xmltodict \
python3dist-xmltodict"

RDEPENDS:${PN} += "python-abi \
python39-xml"

inherit rpm
