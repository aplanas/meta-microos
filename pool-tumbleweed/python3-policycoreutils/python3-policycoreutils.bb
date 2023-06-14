SUMMARY = "SELinux policy core python3 interfaces"
DESCRIPTION = "The python-policycoreutils package contains the interfaces that can be used \
by python in an SELinux environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.5"

RPM_NAME = "python3-policycoreutils-3.5-2.1.noarch.rpm"
RPM_HASH = "cb05817c96be1718aeadc6afa7788324876abda844e42936b7da1374c26b6b79cd9332fb73b347f4de3f5aee4e359a68f3fab6204f00a5cf5bc710d65c111504"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "policycoreutils-python \
python3-policycoreutils \
python3.10dist-sepolicy \
python3dist-sepolicy"

RDEPENDS:${PN} += "checkpolicy \
policycoreutils \
python-abi \
python3-audit \
python3-selinux \
python3-semanage \
python3-setools \
python3-setuptools"

inherit rpm
