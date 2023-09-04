SUMMARY = "Moose type constraints for strings or string-like objects"
DESCRIPTION = "This module provides a more general version of the 'Str' type. If coercions \
are enabled, it will accepts objects that overload stringification and \
coerces them into strings."
LICENSE = "Apache-2.0"

PV = "0.003"

RPM_NAME = "perl-MooseX-Types-Stringlike-0.003-3.27.noarch.rpm"
RPM_HASH = "7c82bb9049ef08fd39fc95bf55b3e3e2b5eeb15884d71e4e21b8458e9107ba0078c02e4d45abc77bfa56661ce50e85b5e1e1d42532c8baf651ca2bee9a4a85f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--Stringlike \
perl-MooseX-Types-Stringlike"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-MooseX--Types \
perl-MooseX--Types--Moose"

inherit rpm
