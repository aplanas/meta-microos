SUMMARY = "Argument Type Classification"
DESCRIPTION = "This module provides various type-testing functions. These are intended for \
functions that, unlike most Perl code, care what type of data they are \
operating on. For example, some functions wish to behave differently \
depending on the type of their arguments (like overloaded functions in \
C++). \
 \
There are two flavours of function in this module. Functions of the first \
flavour only provide type classification, to allow code to discriminate \
between argument types. Functions of the second flavour package up the most \
common type of type discrimination: checking that an argument is of an \
expected type. The functions come in matched pairs, of the two flavours, \
and so the type enforcement functions handle only the simplest requirements \
for arguments of the types handled by the classification functions. \
Enforcement of more complex types may, of course, be built using the \
classification functions, or it may be more convenient to use a module \
designed for the more complex job, such as Params::Validate. \
 \
This module is implemented in XS, with a pure Perl backup version for \
systems that can't handle XS."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.015"

RPM_NAME = "perl-Params-Classify-0.015-1.30.aarch64.rpm"
RPM_HASH = "94083fbabb4a79591ef36307e6ce87938d93f12365e01584a8af2444bd888281077a17a4bf49252535b0652de3551fd2131744ecd844c4fd7803eee6aa246a53"

RPROVIDES:${PN} += "perl-Params--Classify \
perl-Params-Classify"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-parent"

inherit rpm
