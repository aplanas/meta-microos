SUMMARY = "Web application framework for the impatient"
DESCRIPTION = "Bobo is a framework for creating WSGI web applications. \
It addresses two problems: mapping URLs to objects, \
and calling objects to generate HTTP responses. \
 \
Bobo doesn't have a templating language, a database integration layer, \
nor a number of other features that are better provided by WSGI \
middle-ware or application-specific libraries. \
 \
Bobo builds on other frameworks, most notably WSGI and WebOb."
LICENSE = "ZPL-2.1"

PV = "2.4.0"

RPM_NAME = "python310-bobo-2.4.0-5.10.noarch.rpm"
RPM_HASH = "b3fb00f0f28205add200e51270125132339809b4a4ccd8f60879f3ccc918f758d353adc64c3ba1a2d665c48190ab8fa75f3cf7e4be87cc4234bd0b686fb906b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-bobo \
python310-bobo \
python3dist-bobo"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-WebOb \
python310-six \
update-alternatives"

inherit rpm
