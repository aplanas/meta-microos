SUMMARY = "Busybox applets replacing net-tools"
DESCRIPTION = "This package contains the symlinks to replace net-tools with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-net-tools-1.36.1-27.1.noarch.rpm"
RPM_HASH = "8dafc0fb7bcf2b4655d5e579309cfd375de9df34eb504461c22a48702e4365a4f0b5cae63e72bee17bb91bed66bf6047a85d4436126b44c4009036a88acb30cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-net-tools"

RDEPENDS:${PN} += "busybox"

inherit rpm
