SUMMARY = "Python module for systemd's service notification protocol"
DESCRIPTION = "A pure Python implementation of systemd's service notification protocol (sd_notify)"
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python311-sdnotify-0.3.2-2.9.noarch.rpm"
RPM_HASH = "969e23da903d906e5e3912d3510779ecb1465c4db466c370a9de2f50b9d9780642710465069d15c094b3e4272f3d857b523900cbef098c3fec13c28c1a5d85f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sdnotify \
python3.11dist-sdnotify \
python311-sdnotify \
python3dist-sdnotify"

RDEPENDS:${PN} += "python-abi"

inherit rpm
