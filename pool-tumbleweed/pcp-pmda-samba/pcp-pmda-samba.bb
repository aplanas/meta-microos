SUMMARY = "Performance Co-Pilot (PCP) metrics for Samba"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Samba."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-samba-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "27e858af26abb9dd6b01545d2586fa2f9097b21ba643880df872a819af73c9b053d6d2404884bfa235ba4e530fdbfe9686e6fd19cd8ff04c07b326c624722a6a"

RPROVIDES:${PN} += "pcp-pmda-samba"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA"

inherit rpm
