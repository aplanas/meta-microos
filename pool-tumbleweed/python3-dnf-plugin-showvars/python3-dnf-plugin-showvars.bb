SUMMARY = "showvars Plugin for DNF"
DESCRIPTION = "This plugin dumps the current value of any defined DNF variables. For example \
$releasever and $basearch."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.17"

RPM_NAME = "python3-dnf-plugin-showvars-4.0.17-2.2.noarch.rpm"
RPM_HASH = "87915ab665aa7bb4460a1a7550d9a5f7363bd8940eac5e996a70d1fb4f84ad1deb30bb6a4fbb7d4efb86d1920daf2767b6da82b61c1aa2bbd0f465f457f8a9fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-plugin-showvars \
python3-dnf-plugin-showvars \
python3-dnf-plugins-extras-showvars"

RDEPENDS:${PN} += "python-abi \
python3-dnf-plugins-extras-common"

inherit rpm
