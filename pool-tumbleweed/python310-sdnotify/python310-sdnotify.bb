SUMMARY = "Python module for systemd's service notification protocol"
DESCRIPTION = "A pure Python implementation of systemd's service notification protocol (sd_notify)"
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python310-sdnotify-0.3.2-2.9.noarch.rpm"
RPM_HASH = "1be8dfb51ef499cb88a7e850ae8418a574796b3e51441b9e460cc160def54dbfcf1b44bcc7cf2ea0083e45caa27bfc4590a2bd6172a7957a6677425a0f17aa16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sdnotify \
python310-sdnotify \
python3dist-sdnotify"

RDEPENDS:${PN} += "python-abi"

inherit rpm
