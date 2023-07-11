SUMMARY = "Generator-based operators for asynchronous iteration"
DESCRIPTION = "aiostream provides a collection of stream operators that can be \
combined to create asynchronous pipelines of operations."
LICENSE = "Apache-2.0"

PV = "0.4.5"

RPM_NAME = "python311-aiostream-0.4.5-1.5.noarch.rpm"
RPM_HASH = "978ea99fdbdbb2d75598865a981fbdab42eaa9db266972d203069734590265cdf853f5e1e146524d52ddac2b099a66ae9101a518e593e3deb3cd83f68a3c0562"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiostream \
python3.11dist-aiostream \
python311-aiostream \
python3dist-aiostream"

RDEPENDS:${PN} += "python-abi \
python311-siosocks"

inherit rpm
