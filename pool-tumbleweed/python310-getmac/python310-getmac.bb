SUMMARY = "Module to get MAC addresses of remote hosts and local interfaces"
DESCRIPTION = "A Python module to get MAC addresses of remote hosts and local interfaces."
LICENSE = "MIT"

PV = "0.8.3"

RPM_NAME = "python310-getmac-0.8.3-1.4.noarch.rpm"
RPM_HASH = "91ae836df34f37737972a24927ec8369c0f29f2ece2b5c1f4bc1e29838b83b06491dacf120711a2c87369a3b84d6dd35795cd07bfa8b3edb0e6a59f4019a9229"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-getmac \
python3.10dist-getmac \
python310-getmac \
python3dist-getmac"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
