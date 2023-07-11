SUMMARY = "A high-level cross-protocol url-grabber"
DESCRIPTION = "A high-level cross-protocol url-grabber for python supporting HTTP, FTP \
and file locations.  Features include keepalive, byte ranges, \
throttling, authentication, proxies and more."
LICENSE = "LGPL-2.1-only"

PV = "4.1.0"

RPM_NAME = "python310-urlgrabber-4.1.0-8.3.noarch.rpm"
RPM_HASH = "dec995558f1a4fe0959a93fa3a0e470ab20a51f5d7ce47b39841739bde07a83192f6d9110a9d99aca2dd44f054b412f143e939b49e8d2a00c551a57f120b2016"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-urlgrabber \
python310-urlgrabber \
python3dist-urlgrabber"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-pycurl \
update-alternatives"

inherit rpm
