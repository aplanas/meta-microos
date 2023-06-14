SUMMARY = "A python port of YUI CSS Compressor"
DESCRIPTION = "Almost exact python port of YUI CSS Compressor."
LICENSE = "BSD-3-Clause"

PV = "0.9.5"

RPM_NAME = "python311-csscompressor-0.9.5-2.3.noarch.rpm"
RPM_HASH = "46544823a3861ccaa90043ce6acee9e29704fc4f978067939ba01d41e1ddafa637b9dc93e01c759b8798194cd63d171686282d2b02b36ceb8c474d9a0bb37527"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-csscompressor \
python311-csscompressor \
python3dist-csscompressor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
