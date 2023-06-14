SUMMARY = "Python Module for Parallel SSH"
DESCRIPTION = "pssh provides parallel versions of the OpenSSH tools that are useful for \
controlling large numbers of machines simultaneously. It includes parallel \
versions of ssh, scp, and rsync, as well as a parallel kill command. \
 \
This package contains the pssh Python module."
LICENSE = "BSD-3-Clause"

PV = "2.3.4+git10.d4909c9"

RPM_NAME = "python-pssh-2.3.4+git10.d4909c9-3.5.noarch.rpm"
RPM_HASH = "4c54ab592012a3c7016da08142de91e667224b76915bf823950566f855669be1a60dffd7753fc3b048948186366be4834f736366e42c38f44fa6434f36af265c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pssh \
python3.10dist-pssh \
python3dist-pssh"

RDEPENDS:${PN} += "openssh \
python-abi \
rsync"

inherit rpm
