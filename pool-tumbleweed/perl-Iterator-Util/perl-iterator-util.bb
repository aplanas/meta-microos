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

RPM_NAME = "perl-Iterator-Util-0.02-14.28.noarch.rpm"
RPM_HASH = "846752924ebdc866124133a42961e9aa07d8053f35b0477e2a9dd96c0f6f1726f8efff1a3a399205b780111f44bc21e926db2940909de143d0323ec7ff67a69f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Iterator--Util \
perl-Iterator-Util"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Exception--Class \
perl-Iterator"

inherit rpm
