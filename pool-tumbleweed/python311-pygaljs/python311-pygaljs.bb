SUMMARY = "Python package providing assets pygaljs"
DESCRIPTION = "Python package providing assets from https://github.com/Kozea/pygal.js"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python311-pygaljs-1.0.2-2.3.noarch.rpm"
RPM_HASH = "a365089b7d6d62a5e3a5bcf2eb3d3e9a4ff2cce12190b46cb79ad6096b5bbbb891162a999624be8742b7cb5e2a1ab2c0346c64a2c0115ebab43fe21879e44758"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pygaljs \
python3.11dist-pygaljs \
python311-pygaljs \
python3dist-pygaljs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
