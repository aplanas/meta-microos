SUMMARY = "Performance Co-Pilot Perl bindings for importing external archive data"
DESCRIPTION = "The PCP::LogImport module contains the Perl language bindings for \
importing data in various 3rd party formats into PCP archives so \
they can be replayed with standard PCP monitoring tools."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "perl-PCP-LogImport-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "99e52e5f6139342b49614c9904e343d6a04f42caad2758c9cf37af5aec4a94e0bf467c6a33a718e081e3206d65222c3e1665a729b79b374132d64e5c03b884de"

RPROVIDES:${PN} += "perl-PCP--LogImport \
perl-PCP-LogImport"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp3 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
