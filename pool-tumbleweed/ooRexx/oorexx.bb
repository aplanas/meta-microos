SUMMARY = "Open Object Rexx"
DESCRIPTION = " \
Open Object Rexx is an object-oriented scripting language. The language \
is designed for both beginners and experienced Rexx programmers. It is \
easy to learn and use, and provides an excellent vehicle to enter the \
world of object-oriented programming without much effort. \
 \
It extends the procedural way of Rexx programming with object-oriented \
features that allow you to gradually change your programming style as \
you learn more about objects. \
 \
For more information on ooRexx, visit http://www.oorexx.org/ \
For more information on Rexx, visit http://www.rexxla.org/"
LICENSE = "CPL-1.0"

PV = "4.2.0"

RPM_NAME = "ooRexx-4.2.0-18.13.aarch64.rpm"
RPM_HASH = "33de47f2d54a4c2e37d99b7506a123760c73b01c87d476a0793a3102e7a50e51819935a92315f00614f1f78cb24eae21283f2f76012df8947c843aa0f9e69f16"

RPROVIDES:${PN} += "libhostemu.so.4 \
librexx.so.4 \
librexxapi.so.4 \
librexxutil.so.4 \
librxmath.so.4 \
librxregexp.so.4 \
librxsock.so.4 \
librxunixsys.so.4 \
ooRexx \
rpm-macro--ooRexx \
rpm-macro--rexxclassdir \
rpm-macro--rexxlibdir"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/update-alternatives \
systemd"

inherit rpm
