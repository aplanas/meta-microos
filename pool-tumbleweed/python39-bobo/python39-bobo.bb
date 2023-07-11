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

RPM_NAME = "python39-bobo-2.4.0-5.10.noarch.rpm"
RPM_HASH = "b9d223b1c40a929595c5ad6f574aa706e683fac3b69b80f64e9e19a4315686eba24922ba1a0f357a14df0e0a0caff33c9c4cc3171b5446a1aae1710a3dcbd423"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bobo \
python39-bobo \
python3dist-bobo"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-WebOb \
python39-six \
update-alternatives"

inherit rpm
