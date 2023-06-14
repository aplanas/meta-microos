SUMMARY = "Devel files for python310-PyQt6-NetworkAuth"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python310-PyQt6-NetworkAuth"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-NetworkAuth-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "6b28cd08e40eeee9352bc09b0afc4ae8b766055012932448e89e31ccf2ee5e679a897e400afe2584aa543f4fe021721ebbb765d67f5bf5b35d6a077f4d69423f"

RPROVIDES:${PN} += "python3-PyQt6-NetworkAuth-devel \
python310-PyQt6-NetworkAuth-devel"

RDEPENDS:${PN} += "python310-PyQt6-devel"

inherit rpm
