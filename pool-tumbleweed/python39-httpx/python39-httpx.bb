SUMMARY = "Python HTTP client with async support"
DESCRIPTION = "Python HTTP client with async support."
LICENSE = "BSD-3-Clause"

PV = "0.24.0"

RPM_NAME = "python39-httpx-0.24.0-1.1.noarch.rpm"
RPM_HASH = "5168f7be85c21cf7ef8ecb37f0046e364a1a4a4e60be693d6e155a1252aaf27114e8d1e1bc2f74ac3fc9b066b059188fec6322de69e699a69852ec241e668b5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-httpx \
python39-httpx \
python3dist-httpx"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-certifi \
python39-httpcore \
python39-idna \
python39-sniffio \
update-alternatives"

inherit rpm
