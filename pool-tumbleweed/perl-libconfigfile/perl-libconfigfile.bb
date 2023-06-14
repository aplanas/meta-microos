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

RPM_NAME = "perl-libconfigfile-1.1.1-164.26.aarch64.rpm"
RPM_HASH = "df740c386292e2c268fb34f5eb02b2b967627d2f042bfc9fdc8354a25f2a3f19468d3747bee9df6e050f1bbf46d7aeb1be6627790cde4e5627ccbe9300c9655d"

RPROVIDES:${PN} += "perl-ConfigFile \
perl-libconfigfile"

RDEPENDS:${PN} += ""

inherit rpm
