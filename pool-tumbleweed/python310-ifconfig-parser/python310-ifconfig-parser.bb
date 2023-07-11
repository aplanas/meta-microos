SUMMARY = "Python package for parsing raw output of ifconfig"
DESCRIPTION = "Python package for parsing raw output of ifconfig."
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "python310-ifconfig-parser-0.0.5-1.15.noarch.rpm"
RPM_HASH = "ecc660d326aa7f0ba7512b23ee2d671813d63985a8fb5b820aab4991cfccba4e147555b8f4e61c9783ec22c789797b8e515011b9f22974f48fd62fad2b0cfa2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ifconfig-parser \
python310-ifconfig-parser \
python3dist-ifconfig-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
