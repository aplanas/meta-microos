SUMMARY = "A high-level cross-protocol url-grabber"
DESCRIPTION = "A high-level cross-protocol url-grabber for python supporting HTTP, FTP \
and file locations.  Features include keepalive, byte ranges, \
throttling, authentication, proxies and more."
LICENSE = "LGPL-2.1-only"

PV = "4.1.0"

RPM_NAME = "python311-urlgrabber-4.1.0-8.3.noarch.rpm"
RPM_HASH = "ea8fbaa320b4ba86b94dc4c325aeb0ba1253735dd8cb2c23839388566d785a2a30179d28b2ddb64b75950a911ac0d4e1ede92c648066bd41417b4e842a5f8df7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-urlgrabber \
python3.11dist-urlgrabber \
python311-urlgrabber \
python3dist-urlgrabber"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-pycurl \
update-alternatives"

inherit rpm
