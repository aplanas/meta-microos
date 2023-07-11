SUMMARY = "A python port of YUI CSS Compressor"
DESCRIPTION = "Almost exact python port of YUI CSS Compressor."
LICENSE = "BSD-3-Clause"

PV = "0.9.5"

RPM_NAME = "python311-csscompressor-0.9.5-3.1.noarch.rpm"
RPM_HASH = "d229f3e998c0b15ce4bb01e05448637e7b3cb444d62acf3d34c0a6c894e40b82dd167055c7d7fdd3b65f53b4126cb7d67678b9f9c1c624ffef8bcd028fd55be0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-csscompressor \
python3.11dist-csscompressor \
python311-csscompressor \
python3dist-csscompressor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
