SUMMARY = "Performance Co-Pilot (PCP) metrics for the Postfix (MTA)"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Postfix (MTA)."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-postfix-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "c0b15cb4b68e0f52da0977dac2a643bc4edca8d5e20f1a8f231c96c8b0d72f84a1bd65622ef0f05345961600e103298f6e861e22939b54aa514718a7a2bc8215"

RPROVIDES:${PN} += "pcp-pmda-postfix"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA \
postfix \
postfix-doc"

inherit rpm
