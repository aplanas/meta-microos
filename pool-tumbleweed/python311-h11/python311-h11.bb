SUMMARY = "A pure-Python, bring-your-own-I/O implementation of HTTP/11"
DESCRIPTION = "This is a little HTTP/1.1 library written from scratch in Python, \
heavily inspired by hyper-h2 <https://hyper-h2.readthedocs.io>"
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python311-h11-0.14.0-2.1.noarch.rpm"
RPM_HASH = "e21b88cd49f91f8d9b7949df606b22680704d0acf05be8c8d78f43c95df80ec71fa6d140af9ff21a05fb53c4b48e4cd4ce4700a7ce033762b36a4a92dec67676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-h11 \
python311-h11 \
python3dist-h11"

RDEPENDS:${PN} += "python-abi"

inherit rpm
