SUMMARY = "Perl Module to interpolate Script Options from Files into @ARGV"
DESCRIPTION = "This module simply interpolates option file hints in @ARGV by the contents of \
the pointed files. This enables option reading from files instead of or \
additional to the usual reading from the command line. \
 \
Alternatively, you can process any array instead of @ARGV which is used by \
default and mentioned mostly in this manual. \
 \
The interpolated @ARGV could be subsequently processed by the usual option \
handling, e.g. by a Getopt::xxx module. Getopt::ArgvFile does not perform any \
option handling itself, it only prepares the array @ARGV."
LICENSE = "Artistic-1.0 | Artistic-2.0"

PV = "1.11"

RPM_NAME = "perl-Getopt-ArgvFile-1.11-9.31.aarch64.rpm"
RPM_HASH = "73cb03b34c679113ac3c6a6979f2b987054a432794fe58820d95b5ce0c2da27d123983a1e475cd5473d6824fe4c1f3bf6445fbd1c72be5e95cb1cab964ac609f"

RPROVIDES:${PN} += "perl-Getopt--ArgvFile \
perl-Getopt-ArgvFile"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
