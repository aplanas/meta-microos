SUMMARY = "Performance Co-Pilot Perl bindings for processing pmlogsummary output"
DESCRIPTION = "The PCP::LogSummary module provides a Perl module for using the \
statistical summary data produced by the Performance Co-Pilot \
pmlogsummary utility.  This utility produces various averages, \
minima, maxima, and other calculations based on the performance \
data stored in a PCP archive.  The Perl interface is ideal for \
exporting this data into third-party tools (e.g. spreadsheets)."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "perl-PCP-LogSummary-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "1587e6ffb314c109c87eacf1f9142649ccdc6bc23443249c6ac75120cd9fecc4d3267b10c894c7de0994abb8e735647466730611b1d5cd44c6a9c74aa22a396a"

RPROVIDES:${PN} += "perl-PCP--LogSummary \
perl-PCP-LogSummary"

RDEPENDS:${PN} += "/usr/bin/env \
libpcp3 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
