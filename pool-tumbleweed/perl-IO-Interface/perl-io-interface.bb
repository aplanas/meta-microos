SUMMARY = "Perl extension for access to network card configuration information"
DESCRIPTION = "IO::Interface adds methods to IO::Socket objects that allows them to be \
used to retrieve and change information about the network interfaces on \
your system. In addition to the object-oriented access methods, you can use \
a function-oriented style. \
 \
THIS API IS DEPRECATED. Please see IO::Interface::Simple for the preferred \
way to get and set interface configuration information."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.09"

RPM_NAME = "perl-IO-Interface-1.09-2.36.aarch64.rpm"
RPM_HASH = "c4d34256ee7ffe3dd64f52c33364ecffa31117931169ee6ef273f37649606b898b9e3909b95391f1b8f7c47c1366b74d27fcc4fea31abe9752e7c412765274dc"

RPROVIDES:${PN} += "perl-IO--Interface \
perl-IO--Interface--Simple \
perl-IO-Interface"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
