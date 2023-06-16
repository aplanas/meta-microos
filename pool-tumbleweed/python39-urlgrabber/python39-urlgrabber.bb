SUMMARY = "A high-level cross-protocol url-grabber"
DESCRIPTION = "A high-level cross-protocol url-grabber for python supporting HTTP, FTP \
and file locations.  Features include keepalive, byte ranges, \
throttling, authentication, proxies and more."
LICENSE = "LGPL-2.1-only"

PV = "4.1.0"

RPM_NAME = "python39-urlgrabber-4.1.0-8.2.noarch.rpm"
RPM_HASH = "f63ddc544272640cc02da061bd5f6d2fa234591fb3ef8d863854afde982b5da643f979acd02e3f6eb4da4f127ec1969818bb35281cf416d6d16787a0ef114de9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-urlgrabber \
python39-urlgrabber \
python3dist-urlgrabber"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-pycurl \
update-alternatives"

inherit rpm
