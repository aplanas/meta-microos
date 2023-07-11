SUMMARY = "MATE Desktop GSchemas"
DESCRIPTION = "This package provides the GSettings schemas for \
MATE Desktop Environment."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.26.1"

RPM_NAME = "mate-desktop-gschemas-1.26.1-1.2.aarch64.rpm"
RPM_HASH = "8787eb48351e301b1aa900e37697b709640d1272e954843f380d4852f7527cc52b45ec9eede32a86f0848696e62d8f710c98b4f6d8b0a364057490c59b637f0c"

RPROVIDES:${PN} += "mate-desktop-gschemas \
mate-desktop-gsettings-schemas"

RDEPENDS:${PN} += "mate-desktop-gschemas-branding"

inherit rpm
