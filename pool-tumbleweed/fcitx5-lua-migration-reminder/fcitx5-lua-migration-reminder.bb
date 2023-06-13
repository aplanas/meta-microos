SUMMARY = "Fcitx5 Lua addon to guide users to migrate their fcitx4 configurations"
DESCRIPTION = "Fcitx5 Lua addon to guide users to migrate their fcitx4 configurations."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.1"

RPM_NAME = "fcitx5-lua-migration-reminder-1.0.1-2.5.aarch64.rpm"
RPM_HASH = "4afe7ed7f86a5dce6a30291fbb2a549c4fb3d75636cb6bf07d7924c545fc1a2c9cc84490b69494762e06936834cc9ddf1c365ec0fa7a3f1453e5bba27528859b"

RPROVIDES:${PN} += "fcitx5-lua-migration-reminder \
fcitx5-lua-migration-reminder(aarch-64)"

RDEPENDS:${PN} += "fcitx5-configtool \
fcitx5-lua \
lua54-lgi"

inherit rpm
