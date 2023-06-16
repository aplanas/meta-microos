SUMMARY = "Performance Co-Pilot (PCP) metrics for the Postfix (MTA)"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Postfix (MTA)."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-postfix-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "59dd14d71629a7c6e22d0a40a7af91d413c31f05c8d41c5191d75127ab28952f66160b043b0d97d39b318361d4a70c69aa03ffa1c5afcfdc7702ca45c135eb96"

RPROVIDES:${PN} += "pcp-pmda-postfix"

RDEPENDS:${PN} += "/usr/bin/sh \
perl-PCP-PMDA \
postfix \
postfix-doc"

inherit rpm
