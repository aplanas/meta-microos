SUMMARY = "SELinux policy core python3 interfaces"
DESCRIPTION = "The python-policycoreutils package contains the interfaces that can be used \
by python in an SELinux environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.5"

RPM_NAME = "python3-policycoreutils-3.5-4.1.noarch.rpm"
RPM_HASH = "9f391dc9b9f559872fb3c3a8cf930350cd40af6975dd138759ec09fdcb305e9d3b16f84d9cad765a58b29f79bf003072e09ef2bd60cbaa2aa6f696ba6471634a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "policycoreutils-python \
python3-policycoreutils \
python3.11dist-sepolicy \
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
