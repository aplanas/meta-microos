SUMMARY = "Timestamp standard input"
DESCRIPTION = "ts adds a timestamp to the beginning of each line of input. \
 \
It supports custom time formats as in the strftime function. It also supports converting existing timestamps in input to relative ones."
LICENSE = "GPL-2.0-or-later"

PV = "0.67"

RPM_NAME = "ts-0.67-2.3.noarch.rpm"
RPM_HASH = "9f59622a90ad73c176df37490f3802ec04dcd978f17a44269baa64c328aa8f41a82d002c5b9f6def5dfe61ec34205edf25efd3819916e03dc1ecb59e2358ed93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "moreutils-/usr/bin/ts \
ts"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Date--Parse \
perl-Getopt--Long \
perl-POSIX \
perl-Time--Duration \
perl-Time--HiRes \
perl-strict \
perl-warnings"

inherit rpm
