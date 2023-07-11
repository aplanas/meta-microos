SUMMARY = "Python HTTP client with async support"
DESCRIPTION = "Python HTTP client with async support."
LICENSE = "BSD-3-Clause"

PV = "0.24.0"

RPM_NAME = "python39-httpx-0.24.0-1.2.noarch.rpm"
RPM_HASH = "4a8c17951052faaf56560d490e76d32ac94442ddfeecae3010f760deaac3aee3ef019376fbcfede5f0c4900421c66d4bd2870dbdaab226a6baf915209e768818"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-httpx \
python39-httpx \
python3dist-httpx"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-certifi \
python39-httpcore \
python39-idna \
python39-sniffio \
update-alternatives"

inherit rpm
