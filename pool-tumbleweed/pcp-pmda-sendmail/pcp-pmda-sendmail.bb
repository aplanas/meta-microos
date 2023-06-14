SUMMARY = "Performance Co-Pilot (PCP) metrics for Sendmail"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Sendmail traffic."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-sendmail-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "661164d12b35f6c60b47f52f72e445ccfcde1556bce8d4782dd5f646e7c89d1ac4350834196ee09714476bb2e23a181bbf95e53b82fed5e3eae6721229a66d70"

RPROVIDES:${PN} += "pcp-pmda-sendmail"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
pcp"

inherit rpm
