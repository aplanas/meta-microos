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

PV = "0.33"

RPM_NAME = "perl-XS-Parse-Keyword-0.33-1.3.aarch64.rpm"
RPM_HASH = "512c444afd56c588492953d15cbd80e04fa25c4e04d8494930466677651e0dc1cf7f98d311f07dba8fe38518cad51da58bc1207d957048b352d8248191348f2d"

RPROVIDES:${PN} += "perl-XS--Parse--Infix \
perl-XS--Parse--Infix--Builder \
perl-XS--Parse--Infix--Builder-data \
perl-XS--Parse--Keyword \
perl-XS--Parse--Keyword--Builder \
perl-XS--Parse--Keyword--Builder-data \
perl-XS-Parse-Keyword"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
