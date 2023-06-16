SUMMARY = "A high-level cross-protocol url-grabber"
DESCRIPTION = "A high-level cross-protocol url-grabber for python supporting HTTP, FTP \
and file locations.  Features include keepalive, byte ranges, \
throttling, authentication, proxies and more."
LICENSE = "LGPL-2.1-only"

PV = "4.1.0"

RPM_NAME = "python310-urlgrabber-4.1.0-8.2.noarch.rpm"
RPM_HASH = "3e10ce4a8625d884fd266ed161347e4f0fff82412aff0a8d38949f03d9b5b19d24431cbd80d30d318bb9c67dc5c7e0aed75d312dda469d8fd371632b09d405df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-urlgrabber \
python3.10dist-urlgrabber \
python310-urlgrabber \
python3dist-urlgrabber"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-pycurl \
update-alternatives"

inherit rpm
