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

RPM_NAME = "python311-bobo-2.4.0-5.9.noarch.rpm"
RPM_HASH = "394f3fe7d15360f10b067315d69815e02bd7f9f96c8b82c956f3a84ccce6095deb95cda99bdef0523922a160ea7b3ab1c34f90f4c8d9b45b2f8594f92af3730c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(bobo) \
python311-bobo \
python3dist(bobo)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-WebOb \
python311-six \
update-alternatives"

inherit rpm
