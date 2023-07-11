SUMMARY = "Validator for HTTP"
DESCRIPTION = "HTTPolice is a validator or linter for HTTP requests and responses. \
It can spot bad header syntax, inappropriate status codes, and other potential \
problems in your HTTP server or client."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python310-HTTPolice-0.9.0-4.16.noarch.rpm"
RPM_HASH = "41ed330bf8008136f3cefcce870ad83565b9bcc8145100b819aa850ea98bec5661492df939c9f0b47203b36f9427aab3dc3ee22c26a5187e113c0fe82a1ec981"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-httpolice \
python310-HTTPolice \
python3dist-httpolice"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Brotli \
python310-bitstring \
python310-defusedxml \
python310-dominate \
python310-lxml \
update-alternatives"

inherit rpm
