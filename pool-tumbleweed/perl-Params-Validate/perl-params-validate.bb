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

RPM_NAME = "perl-Params-Validate-1.31-1.3.aarch64.rpm"
RPM_HASH = "0668ed5b263551f879d2447d3b4e8736c9929ac4b2dab1b044a912d74a086650c4f4b2e23957fadede96bed8b519b4bfffd7c5dd6c1a7aa63a6754ab4decac7f"

RPROVIDES:${PN} += "perl-Params--Validate \
perl-Params--Validate--Constants \
perl-Params--Validate--PP \
perl-Params--Validate--XS \
perl-Params-Validate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-Module--Implementation"

inherit rpm
