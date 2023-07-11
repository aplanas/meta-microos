SUMMARY = "A python port of YUI CSS Compressor"
DESCRIPTION = "Almost exact python port of YUI CSS Compressor."
LICENSE = "BSD-3-Clause"

PV = "0.9.5"

RPM_NAME = "python39-csscompressor-0.9.5-3.1.noarch.rpm"
RPM_HASH = "35806058e903a5b16e9d902ed603cfa5e77b24752ccb2b2d059148a0966dc973a9e224f775c66df1952cc613dc5cc53788548ad2fce7dafa121221e143531ac8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-csscompressor \
python39-csscompressor \
python3dist-csscompressor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
