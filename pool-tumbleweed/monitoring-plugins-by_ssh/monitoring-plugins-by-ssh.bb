SUMMARY = "Execute checks via SSH"
DESCRIPTION = "This plugin uses SSH to execute commands on a remote host. \
 \
The most common mode of use is to refer to a local identity file with \
the '-i' option. In this mode, the identity pair should have a null \
passphrase and the public key should be listed in the authorized_keys \
file of the remote host. Usually the key will be restricted to running \
only one command on the remote server. If the remote SSH server tracks \
invocation arguments, the one remote program may be an agent that can \
execute additional commands as proxy."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-by_ssh-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "098daf723fd75769dbac44adeb1483f02e635da2a1efad414d657fdc62c2645557e4927960b1dc74de6bfa1f3242e49de9f306c93720e459d0ea83b265bb17b9"

RPROVIDES:${PN} += "monitoring-plugins-by-ssh \
nagios-plugins-by-ssh"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
openssh"

inherit rpm
