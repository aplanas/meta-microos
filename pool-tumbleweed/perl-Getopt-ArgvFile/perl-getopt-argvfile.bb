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

RPM_NAME = "perl-Getopt-ArgvFile-1.11-9.30.aarch64.rpm"
RPM_HASH = "a8bd7aa51b080e81d9ba9a54f281362f508533c0f755b47a2190cbe90b63347dc8bab9b4f7ba15c7e6b26881fce5472e8ad866e6925353962263b062e2c40e42"

RPROVIDES:${PN} += "perl-Getopt--ArgvFile \
perl-Getopt-ArgvFile"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
