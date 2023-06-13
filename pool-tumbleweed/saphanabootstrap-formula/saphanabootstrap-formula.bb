SUMMARY = "SAP HANA platform deployment formula"
DESCRIPTION = "SAP HANA deployment salt formula. This formula is capable to install \
SAP HANA nodes, enable system replication and configure SLE-HA cluster \
with the SAPHanaSR resource agent, using standalone salt or via SUSE Manager \
formulas with forms, available on SUSE Manager 4.0. \
 \
In order to use the formula, salt must be available in the system. The package comes automatically \
in SLE15. To use it in SLE12, salt (and it sub-components) comes from the Advanced systems management \
module, which can be added running the `SUSEConnect -p sle-module-adv-systems-management/12/{{ arch }}`"
LICENSE = "Apache-2.0"

PV = "0.13.1+git.1667812208.4db963e"

RPM_NAME = "saphanabootstrap-formula-0.13.1+git.1667812208.4db963e-1.2.noarch.rpm"
RPM_HASH = "2412ac6a28f5282cde86b96198836ce9f0e5d354014bfb475eb727427edb1ad8c2f0c8e9f2afe59b8f7dda4a233148a7a57b4a6ed724b27f3f3843cf4944712b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saphanabootstrap-formula"

RDEPENDS:${PN} += "habootstrap-formula \
salt-formulas-configuration \
salt-shaptools"

inherit rpm
