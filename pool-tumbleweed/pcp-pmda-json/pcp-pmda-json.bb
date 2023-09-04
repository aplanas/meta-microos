SUMMARY = "Performance Co-Pilot (PCP) metrics for JSON data"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics output in JSON."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-json-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "fa067ab581c8173eec419e3ecf461f30296fbcc1cb8c15ed0cae08ffec344e1d34930d63dcc2c4cc1869c5436766f1d0ad08e39ff4c47b6bf3bbbc2a24f20332"

RPROVIDES:${PN} += "config-pcp-pmda-json \
pcp-pmda-json"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-jsonpointer \
python3-pcp \
python3-six"

inherit rpm
