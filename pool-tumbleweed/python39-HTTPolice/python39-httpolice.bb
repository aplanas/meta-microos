SUMMARY = "Validator for HTTP"
DESCRIPTION = "HTTPolice is a validator or linter for HTTP requests and responses. \
It can spot bad header syntax, inappropriate status codes, and other potential \
problems in your HTTP server or client."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python39-HTTPolice-0.9.0-4.14.noarch.rpm"
RPM_HASH = "26bb0d59603eda16047c88d255752abc42e826ec37b3bf4dba59f07086d4eea0c30908054bc5b2119df50e44eb3d5f56c8682316812a6a890a402b9d2fedae25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(httpolice) \
python39-HTTPolice \
python3dist(httpolice)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-Brotli \
python39-bitstring \
python39-defusedxml \
python39-dominate \
python39-lxml \
update-alternatives"

inherit rpm
