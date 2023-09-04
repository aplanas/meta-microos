SUMMARY = "Performance Co-Pilot (PCP) metrics for the Unbound DNS Resolver"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Unbound DNS Resolver."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-unbound-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "fe6938c2cf94458a33d319af09ee88dfdaaeecbcdb29955c61afb3173db50f2784195bf20b7c8b7d792277743ce9b937c757acfa49bd1d6f2df76b96c1ba6e33"

RPROVIDES:${PN} += "pcp-pmda-unbound"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
python3-pcp"

inherit rpm
