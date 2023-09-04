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

RPM_NAME = "perl-MooX-Types-MooseLike-0.29-1.27.noarch.rpm"
RPM_HASH = "55c2005150dafce23232635fc443a632b327f837556c24b01448421c892ad2e3e7ac01d1c56671e012bd1ec0ef0b3d15c0905fa848a41378c9653567b772721f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooX--Types--MooseLike \
perl-MooX--Types--MooseLike--Base \
perl-MooX-Types-MooseLike"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Module--Runtime"

inherit rpm
