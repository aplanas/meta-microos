SUMMARY = "Performance Co-Pilot Perl bindings for importing external archive data"
DESCRIPTION = "The PCP::LogImport module contains the Perl language bindings for \
importing data in various 3rd party formats into PCP archives so \
they can be replayed with standard PCP monitoring tools."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "perl-PCP-LogImport-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "777a4eaec3cc9274818fd790562a41660876635c6895d48eb12b8519c8d1c891443c449ebc8a0d8fb5ff5789f31f2558aac8c3e45aa8ab1f5394bc88f33293ae"

RPROVIDES:${PN} += "perl-PCP--LogImport \
perl-PCP-LogImport"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp3 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
