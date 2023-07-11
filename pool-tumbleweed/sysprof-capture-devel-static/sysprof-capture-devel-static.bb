SUMMARY = "Library to read and write syspref's capture format"
DESCRIPTION = "This static library allows external tooling to read and write the \
syspref's capture format."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.48.0"

RPM_NAME = "sysprof-capture-devel-static-3.48.0-2.2.aarch64.rpm"
RPM_HASH = "9a06c525fcb941539a584d153c137bcfc54f9704ea3307601e4c7fed845e70830832743c4da2701a5497606c78919747078c87d5a3f76454593736e27333d79a"

RPROVIDES:${PN} += "pkgconfig-sysprof-capture-4 \
sysprof-capture-devel-static"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
