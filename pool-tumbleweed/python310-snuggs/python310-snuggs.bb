SUMMARY = "S-expressions tool for Numpy"
DESCRIPTION = "Snuggs are s-expressions for Numpy."
LICENSE = "MIT"

PV = "1.4.7"

RPM_NAME = "python310-snuggs-1.4.7-2.9.noarch.rpm"
RPM_HASH = "8a1468326bceb14820c786e4ac9582446fa873edd8a6dbefd675d9b6ac18fdb6fef1d21657bcdefe75be7f724ad06917d24e1f53469f4385c24ec78a8ead7f7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-snuggs \
python310-snuggs \
python3dist-snuggs"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-pyparsing"

inherit rpm
