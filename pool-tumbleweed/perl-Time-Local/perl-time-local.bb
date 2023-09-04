SUMMARY = "Efficiently compute time from local and GMT time"
DESCRIPTION = "This module provides functions that are the inverse of built-in perl \
functions 'localtime()' and 'gmtime()'. They accept a date as a six-element \
array, and return the corresponding 'time(2)' value in seconds since the \
system epoch (Midnight, January 1, 1970 GMT on Unix, for example). This \
value can be positive or negative, though POSIX only requires support for \
positive values, so dates before the system's epoch may not work on all \
operating systems. \
 \
It is worth drawing particular attention to the expected ranges for the \
values provided. The value for the day of the month is the actual day (i.e. \
1..31), while the month is the number of months since January (0..11). This \
is consistent with the values returned from 'localtime()' and 'gmtime()'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.35"

RPM_NAME = "perl-Time-Local-1.35-1.3.noarch.rpm"
RPM_HASH = "b07f0cd1a6a65cf1489fbb05c9bff1e87094634500fbd866dc04aef709e4c0dee8c282b2407cf57830383f3600edca07811c2e50e5958c4b7499b3f28a4332d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Time--Local \
perl-Time-Local"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-parent"

inherit rpm
