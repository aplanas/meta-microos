SUMMARY = "Parallel SSH to control large numbers of Machines simultaneously"
DESCRIPTION = "pssh provides parallel versions of the OpenSSH tools that are useful for \
controlling large numbers of machines simultaneously. It includes parallel \
versions of ssh, scp, and rsync, as well as a parallel kill command."
LICENSE = "BSD-3-Clause"

PV = "2.3.4+git10.d4909c9"

RPM_NAME = "pssh-2.3.4+git10.d4909c9-3.6.noarch.rpm"
RPM_HASH = "9840752e87594979b2e2cbe9c70f0ff892d1dc8a32b90f4d6cbbfecb8d8a5a9363d45b16629359122900c4c89fbe61aaf1902b7dcf857243f6a2c680533d3bce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pssh"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-pssh"

inherit rpm
