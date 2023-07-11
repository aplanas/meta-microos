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

RPM_NAME = "perl-libconfigfile-1.1.1-164.27.aarch64.rpm"
RPM_HASH = "0c3418132524e803e4ba04c18e818e4a0810d79a7bb81447cd6ad6a6d4ccc63553d1629f615b6e2cb5a769193dd11695bfecf3edf497337e3e714dd9253e2579"

RPROVIDES:${PN} += "perl-ConfigFile \
perl-libconfigfile"

RDEPENDS:${PN} += ""

inherit rpm
