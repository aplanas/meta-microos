SUMMARY = "Performance Co-Pilot (PCP) metrics for Netfilter framework"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Netfilter packet filtering framework."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-netfilter-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "c54770d27acbfe8a1adcd3f446ed289f55e6c723604a40d29751da7e60ade255ccb386efe1fa159797866efbf2d4e1c7e882c2f81e8dac3995d673b0e077832b"

RPROVIDES:${PN} += "pcp-pmda-netfilter"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
