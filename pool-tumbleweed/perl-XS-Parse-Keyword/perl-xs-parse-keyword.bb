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

PV = "0.34"

RPM_NAME = "perl-XS-Parse-Keyword-0.34-1.1.aarch64.rpm"
RPM_HASH = "9b3fde9c066fc6118e6320809d98021a903e5fe4f4ff2af366e7d572fa1820e828915046c6ec3d44ed9a0054febd7198acd0fcd182d4e5d0aa385e90699cf9a1"

RPROVIDES:${PN} += "perl-XS--Parse--Infix \
perl-XS--Parse--Infix--Builder \
perl-XS--Parse--Infix--Builder-data \
perl-XS--Parse--Keyword \
perl-XS--Parse--Keyword--Builder \
perl-XS--Parse--Keyword--Builder-data \
perl-XS-Parse-Keyword"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
