SUMMARY = "Command line VNC client"
DESCRIPTION = "Command line VNC client."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-vncdotool-1.0.0-6.3.noarch.rpm"
RPM_HASH = "a747fdf347bc98c1e5c546887b824b2d5bcdf0d9076d74d5ad8a04747b7e307f2126ba5027188425d3d75cd92542fbeeb1de51a401b26f354e29b6f974a0ff6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-vncdotool \
python310-vncdotool \
python3dist-vncdotool"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Pillow \
python310-Twisted \
update-alternatives"

inherit rpm
