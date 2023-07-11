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

RPM_NAME = "ksh-93vu-6.3.aarch64.rpm"
RPM_HASH = "3d6e6ebf02ee7aad16b46e1a8b4245bcc70ff9b4d2e65b8bd6c6c755cef1063044ec639490c59487cd930a0750b664998ff230551d09da37db06426e1dff34d2"

RPROVIDES:${PN} += "ksh \
libast.so.5 \
libcmd.so.1 \
libdll.so.1 \
libshell.so.1"

RDEPENDS:${PN} += "/etc/bash.bashrc \
/usr/bin/ln \
/usr/bin/rm \
/usr/bin/sh \
/usr/bin/true \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
update-alternatives"

inherit rpm
