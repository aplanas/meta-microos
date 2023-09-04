SUMMARY = "Parses simple configuration files"
DESCRIPTION = "ConfigFile parses simple configuration files and stores its values in an \
anonymous hash reference. The syntax of the configuration file is quite \
simple: \
 \
1.  This is a comment VALUE_ONE = foo VALUE_TWO = $VALUE_ONE/bar \
VALUE_THREE = The value contains a \\# (hash). # This is a comment. \
COMPOSED_VALUE[one] = The first component of a clustered value \
COMPOSED_VALUE[two] = The second component of a clustered value \
 \
 \
 \
Authors: \
-------- \
    Sebastien J. Gross <seb@sjgross.org>"
LICENSE = "GPL-2.0+"

PV = "1.1.1"

RPM_NAME = "perl-libconfigfile-1.1.1-164.28.aarch64.rpm"
RPM_HASH = "82b1dc86d958114462b232eb994cebf4b90049459f48fb78d2f2b734031977724b0bbaf85490e14a456457eca19ba931bd9551d3efb46b7540c904dade494088"

RPROVIDES:${PN} += "perl-ConfigFile \
perl-libconfigfile"

RDEPENDS:${PN} += ""

inherit rpm
