SUMMARY = "Python Module for Parallel SSH"
DESCRIPTION = "pssh provides parallel versions of the OpenSSH tools that are useful for \
controlling large numbers of machines simultaneously. It includes parallel \
versions of ssh, scp, and rsync, as well as a parallel kill command. \
 \
This package contains the pssh Python module."
LICENSE = "BSD-3-Clause"

PV = "2.3.4+git10.d4909c9"

RPM_NAME = "python-pssh-2.3.4+git10.d4909c9-3.6.noarch.rpm"
RPM_HASH = "82a46a12c933f0f9b092fcaacd4fba2514217397a5f06a40f08d17c15fd0b14d778800819e1e54b68c3d03bd7bb1c557b6cb3a27fa152db12712c149477d8c0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pssh \
python3.11dist-pssh \
python3dist-pssh"

RDEPENDS:${PN} += "openssh \
python-abi \
rsync"

inherit rpm
