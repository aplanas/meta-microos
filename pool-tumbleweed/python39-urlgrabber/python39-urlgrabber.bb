SUMMARY = "A high-level cross-protocol url-grabber"
DESCRIPTION = "A high-level cross-protocol url-grabber for python supporting HTTP, FTP \
and file locations.  Features include keepalive, byte ranges, \
throttling, authentication, proxies and more."
LICENSE = "LGPL-2.1-only"

PV = "4.1.0"

RPM_NAME = "python39-urlgrabber-4.1.0-8.3.noarch.rpm"
RPM_HASH = "fe09ef3502ddfef37ace9bccfb74a73a6e0f3cc581b4e705564f705ebe460b3c0383c36dabba835c3e96098bf43eac2d5fa4c9b41a83b7f26a0aa69384cf646b"
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
