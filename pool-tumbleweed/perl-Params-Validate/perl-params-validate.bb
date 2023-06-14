SUMMARY = "Validate method/function parameters"
DESCRIPTION = "*I would recommend you consider using Params::ValidationCompiler instead. \
That module, despite being pure Perl, is _significantly_ faster than this \
one, at the cost of having to adopt a type system such as Specio, \
Type::Tiny, or the one shipped with Moose*. \
 \
This module allows you to validate method or function call parameters to an \
arbitrary level of specificity. At the simplest level, it is capable of \
validating the required parameters were given and that no unspecified \
additional parameters were passed in. \
 \
It is also capable of determining that a parameter is of a specific type, \
that it is an object of a certain class hierarchy, that it possesses \
certain methods, or applying validation callbacks to arguments."
LICENSE = "Artistic-2.0"

PV = "1.31"

RPM_NAME = "perl-Params-Validate-1.31-1.2.aarch64.rpm"
RPM_HASH = "488bb9d8b83cd4f5490a51ed22c7e29cff9054a4389604274aeb15bcb6c086f72bef0e1969804a1f982d2aed926c7249f2f9571cf1f34b5e95eaf3e728584ef7"

RPROVIDES:${PN} += "perl-Params--Validate \
perl-Params--Validate--Constants \
perl-Params--Validate--PP \
perl-Params--Validate--XS \
perl-Params-Validate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.0 \
perl-Module--Implementation"

inherit rpm
