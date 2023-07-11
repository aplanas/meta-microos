SUMMARY = "Performance Co-Pilot (PCP) metrics for Named"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Named nameserver."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-named-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "745a38c85f95f3168c6bb722301567c93e3be09d822bc324394ee4dd1c3d3afae399977cad4bcdfd57a6535cd8de708f6ec1b1adf7b599253aec0b6376d9c994"

RPROVIDES:${PN} += "pcp-pmda-named"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
