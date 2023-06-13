SUMMARY = "The binfmt_misc support for Java"
DESCRIPTION = "Linux beats them ALL! While all other OS's are TALKING about direct \
support of Java Binaries in the OS, Linux is doing it! \
 \
You can execute Java applications and Java Applets just like any other \
program after you have installed this package."
LICENSE = "GPL-2.0"

PV = "1.4"

RPM_NAME = "java-binfmt-misc-1.4-9.11.aarch64.rpm"
RPM_HASH = "db2ee956395729da67a521577e360a5902923b5cf57831bcd79f3b331de22dd29cde43aab73fdb7c4e4051428af9baf04ce53ce8378cc15eaddd7ad44b1bd302"

RPROVIDES:${PN} += "application() \
application(jarwrapper.desktop) \
application(javawrapper.desktop) \
application(javawswrapper.desktop) \
java-binfmt-misc \
java-binfmt-misc(aarch-64) \
jpackage-utils:/usr/bin/jarwrapper \
mimehandler(application/x-jar) \
mimehandler(application/x-java) \
mimehandler(application/x-java-archive) \
mimehandler(application/x-java-jnlp-file)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
desktop-file-utils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
shared-mime-info \
systemd"

inherit rpm
