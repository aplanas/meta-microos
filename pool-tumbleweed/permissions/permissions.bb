SUMMARY = "SUSE Linux Default Permissions"
DESCRIPTION = "File and directory permission settings depending on the local security \
settings. The local security setting ('easy', 'secure', or 'paranoid') can be \
configured in /etc/sysconfig/security. \
 \
This package does not contain files, it just requires the necessary packages."
LICENSE = "GPL-2.0-or-later"

PV = "1699_20230602"

RPM_NAME = "permissions-1699_20230602-1.3.aarch64.rpm"
RPM_HASH = "8248aeb75fc59bb1a4b6dfcfe57ee89ae9cd376390d69285ed1db99488a28447a15ec09ae2b504fed227745106940279eef1a04ebc9081e3c31e471fcaa56137"

RPROVIDES:${PN} += "aaa-base-/usr/share/permissions \
permissions"

RDEPENDS:${PN} += "chkstat \
permissions-config"

inherit rpm
