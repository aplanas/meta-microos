SUMMARY = "Validator for HTTP"
DESCRIPTION = "HTTPolice is a validator or linter for HTTP requests and responses. \
It can spot bad header syntax, inappropriate status codes, and other potential \
problems in your HTTP server or client."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python39-HTTPolice-0.9.0-4.16.noarch.rpm"
RPM_HASH = "ebe7013313ad50dfe94c302d26c5e56c85a9edb7325d5357c18b4f78f3d3bcfb1ecd282439d85c8379de3c93eccb9d138b5e8ddd67abb4b1cae65ab05cb3ac02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-httpolice \
python39-HTTPolice \
python3dist-httpolice"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Brotli \
python39-bitstring \
python39-defusedxml \
python39-dominate \
python39-lxml \
update-alternatives"

inherit rpm
