SUMMARY = "Execute some commands as root"
DESCRIPTION = "Sudo is a command that allows users to execute some commands as root. \
The /etc/sudoers file (edited with 'visudo') specifies which users have \
access to sudo and which commands they can run. Sudo logs all its \
activities to syslogd, so the system administrator can keep an eye on \
things. Sudo asks for the password for initializing a check period of a \
given time N (where N is defined at installation and is set to 5 \
minutes by default)."
LICENSE = "ISC"

PV = "1.9.14p1"

RPM_NAME = "sudo-1.9.14p1-1.1.aarch64.rpm"
RPM_HASH = "bc0336692c54268f87dad1243bf099895c98d90cc4d3fbe39c59bee6b717f14a3e9000cf3cf9004988e30b5ce47c78374c11a1e01aa56e5609a179af717df881"

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
