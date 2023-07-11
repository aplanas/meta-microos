SUMMARY = "Korn Shell development environment"
DESCRIPTION = "The package includes C header files and the static libraries together \
with the shared libraries for linking with other projects.  Please be \
aware that the CPL licensed code can not be used within GPL licensed \
project. \
 \
 \
 \
Authors: \
-------- \
    David Korn <dgk@research.att.com> \
    Glenn Fowler <gsf@research.att.com> \
    Phong Vo <kpv@research.att.com>"
LICENSE = "CPL-1.0"

PV = "93vu"

RPM_NAME = "ksh-devel-93vu-6.3.aarch64.rpm"
RPM_HASH = "6cf8338210d806b089a8b58b64813a4d45e9c33394ba5fc86a0e12f7e21edb9e0cee246807aa0084211f2e3bf000ef06b0a01fd3729c5b66f99c6a2a7e77bba9"

RPROVIDES:${PN} += "ksh-devel"

RDEPENDS:${PN} += "ksh"

inherit rpm
