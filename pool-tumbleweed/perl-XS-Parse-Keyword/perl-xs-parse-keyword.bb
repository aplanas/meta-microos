SUMMARY = "XS functions to assist in parsing keyword syntax"
DESCRIPTION = "This module provides some XS functions to assist in writing syntax modules \
that provide new perl-visible syntax, primarily for authors of keyword \
plugins using the 'PL_keyword_plugin' hook mechanism. It is unlikely to be \
of much use to anyone else; and highly unlikely to be any use when writing \
perl code using these. Unless you are writing a keyword plugin using XS, \
this module is not for you. \
 \
This module is also currently experimental, and the design is still \
evolving and subject to change. Later versions may break ABI compatibility, \
requiring changes or at least a rebuild of any module that depends on it."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.380.0"

RPM_NAME = "perl-XS-Parse-Keyword-0.380.0-1.1.aarch64.rpm"
RPM_HASH = "eba10d33317d9b372aaf5bfdf06cc4afc3849c8dbb370f97cfc4342928ac4dc63dd381a1fa1f3fc72aac23e655fb5efa4d520bb0e720a93a855a97ceea2daa5d"

RPROVIDES:${PN} += "perl-XS--Parse--Infix \
perl-XS--Parse--Infix--Builder \
perl-XS--Parse--Keyword \
perl-XS--Parse--Keyword--Builder \
perl-XS-Parse-Keyword"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
