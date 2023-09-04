SUMMARY = "Performance Co-Pilot (PCP) Python3 bindings and documentation"
DESCRIPTION = "This python PCP module contains the language bindings for \
Performance Metric API (PMAPI) monitor tools and Performance \
Metric Domain Agent (PMDA) collector tools written in Python3."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "python3-pcp-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "fb2959454c61611968acf761f044bae51bb777e48227e4034ef783ddf9a43a8ed439236c5ac61b77181ec3bc0e144d339cb672d39c602013528e11d98d31c739"

RPROVIDES:${PN} += "python3-pcp \
python3.11dist-pcp \
python3dist-pcp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-gui2 \
libpcp-import1 \
libpcp-mmv1 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libpcp3 \
python-abi \
python3"

inherit rpm
