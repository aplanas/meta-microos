SUMMARY = "RPM macros for Godot"
DESCRIPTION = "Provides RPM macros that will allow for easier packaging of games made with \
the Godot engine."
LICENSE = "MIT"

PV = "1"

RPM_NAME = "godot-rpm-macros-1-1.10.noarch.rpm"
RPM_HASH = "2722cfc0fb1c77fffeba6196e3f620cb05dfbef447d557e154482dc67369e528e38f90b84cbfe14dcaf8730b4aa2bd5e14f24828fe3a27e721489aba485750f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "godot-rpm-macros \
rpm_macro(godot_export) \
rpm_macro(godot_prep)"

RDEPENDS:${PN} += "coreutils"

inherit rpm
