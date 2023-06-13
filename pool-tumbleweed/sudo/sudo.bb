SUMMARY = "Execute some commands as root"
DESCRIPTION = "Sudo is a command that allows users to execute some commands as root. \
The /etc/sudoers file (edited with 'visudo') specifies which users have \
access to sudo and which commands they can run. Sudo logs all its \
activities to syslogd, so the system administrator can keep an eye on \
things. Sudo asks for the password for initializing a check period of a \
given time N (where N is defined at installation and is set to 5 \
minutes by default)."
LICENSE = "ISC"

PV = "1.9.13p3"

RPM_NAME = "sudo-1.9.13p3-3.1.aarch64.rpm"
RPM_HASH = "43424f7c99dc5025233a2821619b2fdf52432ab318420f5ea5650612c1f4ceb01ec342f638f92124faeadee455845204ac6e4121831ade1a0d108108298bf2b3"

RPROVIDES:${PN} += "config(sudo) \
libsudo_util.so.0()(64bit) \
sudo \
sudo(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ld-linux-aarch64.so.1()(64bit) \
libaudit.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
liblber.so.2()(64bit) \
libldap.so.2()(64bit) \
libpam.so.0()(64bit) \
libselinux.so.1()(64bit) \
libssl.so.3()(64bit) \
libz.so.1()(64bit) \
permissions"

inherit rpm
