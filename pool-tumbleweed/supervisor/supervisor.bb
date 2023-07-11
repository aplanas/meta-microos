SUMMARY = "A system for controlling process state under UNIX"
DESCRIPTION = "Supervisor is a client/server system that allows its users to \
control a number of processes on UNIX-like operating systems."
LICENSE = "SUSE-Repoze"

PV = "4.2.5"

RPM_NAME = "supervisor-4.2.5-1.4.noarch.rpm"
RPM_HASH = "ddc46ad74775e67afb0b62e95201c82b0b8d6949c7d79cc8d12cf12adc555a0eeb022e219ae6dae8972083bee4c5ea2c34883923b600a9b5268e9af4646c2381"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-supervisor \
python3.11dist-supervisor \
python3dist-supervisor \
supervisor"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-setuptools \
systemd"

inherit rpm
