SUMMARY = "Performance Co-Pilot (PCP) Python3 bindings and documentation"
DESCRIPTION = "This python PCP module contains the language bindings for \
Performance Metric API (PMAPI) monitor tools and Performance \
Metric Domain Agent (PMDA) collector tools written in Python3."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "python3-pcp-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "1b7da0d24c7a20018b1abcf2b7587efbf80b965475672e7cc9166f4071f981b6607b53e4809f9d17f70e4a3439402aae29eb61d5f4d9f0628d6a92a4935aafc7"

RPROVIDES:${PN} += "python3-pcp \
python3-pcp(aarch-64) \
python3.10dist(pcp) \
python3dist(pcp)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpcp.so.3()(64bit) \
libpcp.so.3(PCP_3.0)(64bit) \
libpcp.so.3(PCP_3.16)(64bit) \
libpcp.so.3(PCP_3.2)(64bit) \
libpcp.so.3(PCP_3.21)(64bit) \
libpcp.so.3(PCP_3.22)(64bit) \
libpcp.so.3(PCP_3.6)(64bit) \
libpcp3 \
libpcp_gui2 \
libpcp_import1 \
libpcp_mmv1 \
libpcp_pmda.so.3()(64bit) \
libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) \
libpcp_pmda.so.3(PCP_PMDA_3.7)(64bit) \
libpcp_pmda.so.3(PCP_PMDA_3.8)(64bit) \
libpcp_pmda.so.3(PCP_PMDA_3.9)(64bit) \
python(abi) \
python3"

inherit rpm
