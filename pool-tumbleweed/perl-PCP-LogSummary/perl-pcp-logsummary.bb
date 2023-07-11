SUMMARY = "Performance Co-Pilot Perl bindings for processing pmlogsummary output"
DESCRIPTION = "The PCP::LogSummary module provides a Perl module for using the \
statistical summary data produced by the Performance Co-Pilot \
pmlogsummary utility.  This utility produces various averages, \
minima, maxima, and other calculations based on the performance \
data stored in a PCP archive.  The Perl interface is ideal for \
exporting this data into third-party tools (e.g. spreadsheets)."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "perl-PCP-LogSummary-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "801968cb3cf534a89f81f3dafc5c40e94d097d05312b3d9bdf2518d09a4d4bc70327dff8696e39514e3ce37045127dae847bcca75dc13e3a2419cfdc8b21efbe"

RPROVIDES:${PN} += "perl-PCP--LogSummary \
perl-PCP-LogSummary"

RDEPENDS:${PN} += "/usr/bin/env \
libpcp3 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
