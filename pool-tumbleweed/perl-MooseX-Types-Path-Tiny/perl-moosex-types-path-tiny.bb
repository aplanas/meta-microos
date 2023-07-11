SUMMARY = "Path::Tiny types and coercions for Moose"
DESCRIPTION = "This module provides Path::Tiny types for Moose. It handles two important \
types of coercion: \
 \
  * coercing objects with overloaded stringification \
 \
  * coercing to absolute paths \
 \
It also can check to ensure that files or directories exist."
LICENSE = "Apache-2.0"

PV = "0.012"

RPM_NAME = "perl-MooseX-Types-Path-Tiny-0.012-1.22.noarch.rpm"
RPM_HASH = "31b2c2b07d0d3a1290e0efe7c16d5ea7753049be39f1cd65c1e3efed49552252c47353f39c2fc935f415c4f6c9fa3e7f8d5c41e901860e311aa5da984d40c0bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--Path--Tiny \
perl-MooseX-Types-Path-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moose \
perl-MooseX--Getopt \
perl-MooseX--Types \
perl-MooseX--Types--Moose \
perl-MooseX--Types--Stringlike \
perl-Path--Tiny \
perl-namespace--autoclean"

inherit rpm
