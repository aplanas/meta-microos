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

RPM_NAME = "perl-IO-Interface-1.09-2.37.aarch64.rpm"
RPM_HASH = "322f978e821093c53f0af648a33e5cd47ff1c74cd05969e43cb0a7bb349652670c4f297da977008e52f82f3cca946da0dd77977a604043d98c22b9a7c794b864"

RPROVIDES:${PN} += "perl-IO--Interface \
perl-IO--Interface--Simple \
perl-IO-Interface"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
