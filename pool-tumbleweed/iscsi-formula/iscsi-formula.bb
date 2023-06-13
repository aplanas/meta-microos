SUMMARY = "Configure iSCSI targets and initiator on GNU/Linux and FreeBSD"
DESCRIPTION = "Configure iSCSI targets and initiator on GNU/Linux and FreeBSD \
 \
In order to use the formula, salt must be available in the system. The package comes automatically \
in SLE15. To use it in SLE12, salt (and it sub-components) comes from the Advanced systems management \
module, which can be added running the `SUSEConnect -p sle-module-adv-systems-management/12/{{ arch }}`"
LICENSE = "Apache-2.0"

PV = "1.1.1"

RPM_NAME = "iscsi-formula-1.1.1-2.7.noarch.rpm"
RPM_HASH = "1d584c8f9a19f67ce895008e3e5f62c8349b00df848d1f01cb18e3f8a95c59e2c1c30fb2034950704934da2f2a6518cedbf14c56fb747763b6dc378d613bde40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iscsi-formula"

RDEPENDS:${PN} += "salt-formulas-configuration"

inherit rpm
