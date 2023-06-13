SUMMARY = "A system for controlling process state under UNIX"
DESCRIPTION = "Supervisor is a client/server system that allows its users to \
control a number of processes on UNIX-like operating systems."
LICENSE = "SUSE-Repoze"

PV = "4.2.5"

RPM_NAME = "supervisor-4.2.5-1.3.noarch.rpm"
RPM_HASH = "b745da5376a560eea7d9549614a8e54e4a4ae884cf57a7ee2da9868011ffacf2acc2eb06b2fb4cff4c65e782fe188c425ac9fadb1c3e596d43a394989ef1767f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(supervisor) \
python3.10dist(supervisor) \
python3dist(supervisor) \
supervisor"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
python(abi) \
python3-setuptools \
systemd"

inherit rpm
