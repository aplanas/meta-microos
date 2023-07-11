SUMMARY = "Performance Co-Pilot (PCP) Python3 bindings and documentation"
DESCRIPTION = "This python PCP module contains the language bindings for \
Performance Metric API (PMAPI) monitor tools and Performance \
Metric Domain Agent (PMDA) collector tools written in Python3."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "python3-pcp-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "1313605e8abd16074c965d14f9373450e5c25dd179f1be8e8e73162ee2b2de1445e7b6e5df05b6be062bc614627baca32ca5b526e9ba88f52a4ae21e3442513f"

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
