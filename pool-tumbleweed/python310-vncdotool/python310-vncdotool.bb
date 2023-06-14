SUMMARY = "Command line VNC client"
DESCRIPTION = "Command line VNC client."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-vncdotool-1.0.0-5.4.noarch.rpm"
RPM_HASH = "3d6f0b74452567f8fcaf4250ba8272356850613aae57fed8c70b58d9ed34e8827a27e74dd8b5d857aabb42f5a200320d65455fa30d1883d53a25bcd83d6bfe12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vncdotool \
python3.10dist-vncdotool \
python310-vncdotool \
python3dist-vncdotool"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-Pillow \
python310-Twisted \
update-alternatives"

inherit rpm
