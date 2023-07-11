SUMMARY = "Main Samba administration tool"
DESCRIPTION = "The package contains samba-tool, the main tool for Samba Administration."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.3+git.303.c08b73d523c"

RPM_NAME = "samba-tool-4.18.3+git.303.c08b73d523c-1.2.aarch64.rpm"
RPM_HASH = "3fc40fc77aa367705ec9747d9f018c1b6f415a6e922b3ef0912080e0254043d45c7483854e6b7f6b6b5144abfeb486cf4b9d43c6cb2dae24db315ae481461a39"

RPROVIDES:${PN} += "samba-tool"

RDEPENDS:${PN} += "/usr/bin/python3 \
samba \
samba-ldb-ldap \
samba-python3"

inherit rpm
