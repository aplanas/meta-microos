SUMMARY = "Korn Shell"
DESCRIPTION = "The original Korn Shell.  The ksh is an sh-compatible command \
interpreter that executes commands read from standard input or from a \
file. \
 \
 \
 \
Authors: \
-------- \
    David Korn <dgk@research.att.com> \
    Glenn Fowler <gsf@research.att.com> \
    Phong Vo <kpv@research.att.com>"
LICENSE = "CPL-1.0 & EPL-1.0"

PV = "93vu"

RPM_NAME = "ksh-93vu-6.2.aarch64.rpm"
RPM_HASH = "295e9e629bd489c21e2da3aefe38434415f4c01d8aebff6434c1df65b205297e0d911b025ba7df9b6705863946652f7feeccc941a4b89e955783b75653fcfa00"

RPROVIDES:${PN} += "ksh \
libast.so.5 \
libcmd.so.1 \
libdll.so.1 \
libshell.so.1"

RDEPENDS:${PN} += "/bin/ln \
/bin/rm \
/bin/sh \
/bin/true \
/etc/bash.bashrc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
update-alternatives"

inherit rpm
