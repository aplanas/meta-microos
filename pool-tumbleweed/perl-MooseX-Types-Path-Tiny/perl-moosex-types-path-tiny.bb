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

RPM_NAME = "perl-MooseX-Types-Path-Tiny-0.012-1.23.noarch.rpm"
RPM_HASH = "7a1f6508da1af3218c0ffc3eb1a503841b25aec4cec6914991563c5cbf65ebbc82b7dadb0fe608611812036a8868131d66d7b342f32881b80d55d793d98ccff5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--Path--Tiny \
perl-MooseX-Types-Path-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose \
perl-MooseX--Getopt \
perl-MooseX--Types \
perl-MooseX--Types--Moose \
perl-MooseX--Types--Stringlike \
perl-Path--Tiny \
perl-namespace--autoclean"

inherit rpm
