SUMMARY = "Validator for HTTP"
DESCRIPTION = "HTTPolice is a validator or linter for HTTP requests and responses. \
It can spot bad header syntax, inappropriate status codes, and other potential \
problems in your HTTP server or client."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python311-HTTPolice-0.9.0-4.16.noarch.rpm"
RPM_HASH = "cf3111dee9d225be6b0043e93ec255f2970db530f06f6e7b504cd0ca03640037683f51214693a861bbafb04134bd4ed176f09744078dd7a2e62944d521cc90ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-HTTPolice \
python3.11dist-httpolice \
python311-HTTPolice \
python3dist-httpolice"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Brotli \
python311-bitstring \
python311-defusedxml \
python311-dominate \
python311-lxml \
update-alternatives"

inherit rpm
