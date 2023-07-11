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

RPM_NAME = "perl-Iterator-Util-0.02-14.27.noarch.rpm"
RPM_HASH = "4cca21a48e4971e3ba8f117b261d8fbfe894c3b567a55def16cc49ef3fa399f0a42c01ff116ec5b46d281aa404650161e4c6d31bad3f6db170adaf6b8e115e09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Iterator--Util \
perl-Iterator-Util"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Exception--Class \
perl-Iterator"

inherit rpm
