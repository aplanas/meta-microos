SUMMARY = "HA cluster (crmsh) deployment salt formula"
DESCRIPTION = "HA cluster salt deployment formula. This formula is capable to perform \
the HA cluster bootstrap actions (init, join, remove) using standalone salt \
or via SUSE Manager formulas with forms, available on SUSE Manager 4.0. \
 \
In order to use the formula, salt must be available in the system. The package comes automatically \
in SLE15. To use it in SLE12, salt (and it sub-components) comes from the Advanced systems management \
module, which can be added running the `SUSEConnect -p sle-module-adv-systems-management/12/{{ arch }}`"
LICENSE = "Apache-2.0"

PV = "0.4.3+git.1625210910.7b0645d"

RPM_NAME = "habootstrap-formula-0.4.3+git.1625210910.7b0645d-1.6.noarch.rpm"
RPM_HASH = "60a562c439d2fcaa0d2ebe35ab2500ae5920e98bc5e815ce8b6bd34f89e759080665b01cbf357865013c1efd385b91984df54d561419246c9c23e83b53d4abce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "habootstrap-formula"
RDEPENDS:${PN} += "salt-formulas-configuration \
salt-shaptools"

inherit rpm
