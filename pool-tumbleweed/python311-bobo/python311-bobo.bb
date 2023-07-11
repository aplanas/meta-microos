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

RPM_NAME = "python311-bobo-2.4.0-5.10.noarch.rpm"
RPM_HASH = "643cce3095d451ba1c5d30eb16469b45297bcd4b45527bdf3ebb7a1b55baa0f6d59690aa8831bcb8714d671fc5420acfeb7b1bf3ddf027d3e26879559af5b28a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bobo \
python3.11dist-bobo \
python311-bobo \
python3dist-bobo"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-WebOb \
python311-six \
update-alternatives"

inherit rpm
