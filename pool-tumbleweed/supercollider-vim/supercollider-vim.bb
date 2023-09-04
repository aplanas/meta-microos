SUMMARY = "SuperCollider support for Vim"
DESCRIPTION = "SuperCollider support for the Vim text editor."
LICENSE = "GPL-3.0-only"

PV = "3.13.0"

RPM_NAME = "supercollider-vim-3.13.0-1.4.aarch64.rpm"
RPM_HASH = "4001971c83999d8a0fe95579db4fd0b7e0ad5890c8276f6310520b58cca038d05c013ca2fecf8c3c481781d1a7b652923f50bc4a22cb9e1194a952d9697a8d20"

RPROVIDES:${PN} += "supercollider-vim"

RDEPENDS:${PN} += "supercollider"

inherit rpm
