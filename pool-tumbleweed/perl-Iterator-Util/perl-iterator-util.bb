SUMMARY = "Essential utilities for the Iterator class"
DESCRIPTION = "This module implements many useful functions for creating and manipulating \
iterator objects. \
 \
An 'iterator' is an object, represented as a code block that generates the \
'next value' of a sequence, and generally implemented as a closure. For \
further information, including a tutorial on using iterator objects, see \
the the Iterator manpage documentation."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.02"

RPM_NAME = "perl-Iterator-Util-0.02-14.26.noarch.rpm"
RPM_HASH = "6a1b41757e35e7405e280418f54e43b2e56b65f89bc3cd62a4bb6e1cdef325e979739982a0b6f2ef5b217a194f56e6c48f38a3d0ad35a90f5740637f937de418"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Iterator--Util \
perl-Iterator-Util"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Exception--Class \
perl-Iterator"

inherit rpm
