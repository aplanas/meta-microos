SUMMARY = "Philips Hue Python library"
DESCRIPTION = "Full featured Python library to control the Philips Hue lighting system."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python310-phue-1.1-2.8.noarch.rpm"
RPM_HASH = "7ca2297e517cf644297b266c793eb9982965ae1ea30312baf99eca89c1da7fbf3e8bef854cda67747955771a7764d9b15141cb57256760e99a833a0af48f14af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-phue \
python310-phue \
python3dist-phue"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
python-abi"

inherit rpm
