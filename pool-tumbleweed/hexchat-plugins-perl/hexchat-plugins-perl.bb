SUMMARY = "Plugin for HexChat adds support for Perl scripts"
DESCRIPTION = "The HexChat plugin providing the Perl scripting interface."
LICENSE = "GPL-2.0-or-later"

PV = "2.16.1"

RPM_NAME = "hexchat-plugins-perl-2.16.1-2.8.aarch64.rpm"
RPM_HASH = "056401cda198b66098257075e56fe960fcd0262c4809692988300471c05efc14491723a1e3d6945f99f16ea6d6c6e3dff975ae050b5886c1d0c7cda77107445f"

RPROVIDES:${PN} += "hexchat-plugins-perl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libperl.so \
perl"

inherit rpm
