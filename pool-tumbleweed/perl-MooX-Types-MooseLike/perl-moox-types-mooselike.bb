SUMMARY = "Some Moosish Types and a Type Builder"
DESCRIPTION = "This module provides a possibility to build your own set of Moose-like \
types. These custom types can then be used to describe fields in Moo-based \
classes. \
 \
See the MooX::Types::MooseLike::Base manpage for a list of available base \
types. Its source also provides an example of how to build base types, \
along with both parameterizable and non-parameterizable."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.29"

RPM_NAME = "perl-MooX-Types-MooseLike-0.29-1.26.noarch.rpm"
RPM_HASH = "8372be3c1e9de2f7af4fa3eb4548ce3ce12432478583c3aec0513e833f09412c01526d3bbb24ce09b0f4639cb85652f43371991d6df591f8c2508170758cb923"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooX--Types--MooseLike \
perl-MooX--Types--MooseLike--Base \
perl-MooX-Types-MooseLike"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Module--Runtime"

inherit rpm
