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

RPM_NAME = "python39-bobo-2.4.0-5.9.noarch.rpm"
RPM_HASH = "d2bc7c528b3f4c5da05c130b5e42501006b6a01744fbfbeac3e04a2bf76eb23d32cf698a704d3c05809da37d829773efd49bf3f8720ad9f22df2e214f2b7bead"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(bobo) \
python39-bobo \
python3dist(bobo)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-WebOb \
python39-six \
update-alternatives"

inherit rpm
