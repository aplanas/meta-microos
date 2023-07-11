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

RPM_NAME = "sudo-1.9.13p3-3.3.aarch64.rpm"
RPM_HASH = "bd36c25409d9a8d77c05af6b7d9ad0ca717946db4a4adfe6e13ebb1065bd7df63a4ebeccfa74cc87ba54436c6656b8db83432cd88109a22fd28e6aede3e8bcce"

RPROVIDES:${PN} += "config-sudo \
libsudo-util.so.0 \
sudo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblber.so.2 \
libldap.so.2 \
libpam.so.0 \
libselinux.so.1 \
libssl.so.3 \
libz.so.1 \
permissions"

inherit rpm
