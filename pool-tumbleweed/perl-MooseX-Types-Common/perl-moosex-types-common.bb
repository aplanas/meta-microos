SUMMARY = "Library of Commonly Used Type Constraints"
DESCRIPTION = "A set of commonly-used type constraints that do not ship with Moose by \
default."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.001014"

RPM_NAME = "perl-MooseX-Types-Common-0.001014-1.21.noarch.rpm"
RPM_HASH = "981ca1f44ba0d9d0d28c81ab892942de72a3678ac1df9db27096d0d2897959ea77071c07f468d3741119f4acf3230549cea36baa3eba386e84659142a6f5c680"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::Types::Common) \
perl(MooseX::Types::Common::Numeric) \
perl(MooseX::Types::Common::String) \
perl-MooseX-Types-Common"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(MooseX::Types) \
perl(MooseX::Types::Moose)"

inherit rpm
