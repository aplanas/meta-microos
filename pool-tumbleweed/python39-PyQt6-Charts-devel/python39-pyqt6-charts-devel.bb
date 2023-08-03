SUMMARY = "Devel files for python39-PyQt6-Charts"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python39-PyQt6-Charts"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-Charts-devel-6.5.0-1.4.aarch64.rpm"
RPM_HASH = "ef23571f85e4a398cf2f800cf0550b6ecfa779efb87f5c1b945075d310b17782accd0e42206c32c00307de516cbe59d52b5929f340b64a2223bc16f7b281dc25"

RPROVIDES:${PN} += "python39-PyQt6-Charts-devel"

RDEPENDS:${PN} += "python-abi \
python39-PyQt6-devel"

inherit rpm
