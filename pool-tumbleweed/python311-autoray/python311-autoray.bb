SUMMARY = "A lightweight python automatic-array library"
DESCRIPTION = "Write backend agnostic numeric code compatible with any numpy-ish array library."
LICENSE = "Apache-2.0"

PV = "0.6.3"

RPM_NAME = "python311-autoray-0.6.3-1.1.noarch.rpm"
RPM_HASH = "e7d166ff70582191dc68865b709392a6c1f34af36b639bfaac855b3297bc3af3e080034089230a7222b84841f52162a4348d06ec7c0fbd8eb7c7ec7a9e33a914"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(autoray) \
python311-autoray \
python3dist(autoray)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
