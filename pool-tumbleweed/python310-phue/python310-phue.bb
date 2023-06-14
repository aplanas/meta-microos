SUMMARY = "Philips Hue Python library"
DESCRIPTION = "Full featured Python library to control the Philips Hue lighting system."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python310-phue-1.1-2.6.noarch.rpm"
RPM_HASH = "ebfc60e526ac7ae6980af4f1ac321ff44e73124ed2b432b4f2932792328eddb94070af6f1e8a83599d71db80e9baa46d2f388cf154f0a74d892404d93278f453"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-phue \
python3.10dist-phue \
python310-phue \
python3dist-phue"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
python-abi"

inherit rpm
