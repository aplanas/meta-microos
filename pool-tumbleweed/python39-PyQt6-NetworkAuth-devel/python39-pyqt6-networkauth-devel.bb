SUMMARY = "Devel files for python39-PyQt6-NetworkAuth"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python39-PyQt6-NetworkAuth"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-NetworkAuth-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "76ee84daa7eafe26e230095e226c27d3fdd6b83f97539a11be6cc00538b178c8af9ac1377d1fdca78b8959c797390176d4b2c68168c4e9ebf6d441129b8afbb7"

RPROVIDES:${PN} += "python39-PyQt6-NetworkAuth-devel"

RDEPENDS:${PN} += "python39-PyQt6-devel"

inherit rpm
