SUMMARY = "Alternative CLI to 'dnf upgrade' suitable for automatic, regular execution"
DESCRIPTION = "Alternative CLI to 'dnf upgrade' suitable for automatic, regular execution."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.14.0"

RPM_NAME = "dnf-automatic-4.14.0-3.1.noarch.rpm"
RPM_HASH = "61f1b11104af4266a3ad5ef5ba98a2e838dbb9e9e532ea3e6c40658928c29d0d098a5ee9a1d86e41de9d5737d02288aa1318c7d0abf978bd204651c13545326d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(dnf-automatic) \
dnf-automatic"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
dnf \
python(abi)"

inherit rpm
