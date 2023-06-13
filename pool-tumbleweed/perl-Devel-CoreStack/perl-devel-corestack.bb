SUMMARY = "try to generate a stack dump from a core file"
DESCRIPTION = "This module attempts to generate a stack dump from a core file by \
locating the best available debugger (if any) and running it with the \
appropriate arguments and command script. \
 \
 \
 \
Authors: \
-------- \
    Alligator Descartes <descarte@hermetica.com> \
    Tim Bunce"
LICENSE = "Artistic-1.0"

PV = "1.3"

RPM_NAME = "perl-Devel-CoreStack-1.3-306.29.aarch64.rpm"
RPM_HASH = "b39585b59838cd316d24eac7d50f325a996f8d308537a64a6fb95ca5ced2ae81902ef5f933a2925c01f014b6ed3fc7c2bb92c6b0fa9afcb1f7e03efc475bde5a"

RPROVIDES:${PN} += "Devel-CoreStack \
perl(Devel::CoreStack) \
perl-Devel-CoreStack \
perl-Devel-CoreStack(aarch-64)"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
