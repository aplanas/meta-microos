SUMMARY = "Central daemon of KDE workspaces: Build Environment"
DESCRIPTION = "KDED runs in the background and performs a number of small tasks. \
Some of these tasks are built in, others are started on demand. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kded-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "bbc854ade02ef5a4f1368f2821e5297a2b6bf7534ddf53640f4d0f4a202c7984d4247151a16ef0420dbfec50cf82179cfe4e4aeadd9e05870f071792ce461486"

RPROVIDES:${PN} += "cmake-KDED \
kded-devel"

RDEPENDS:${PN} += "extra-cmake-modules \
kded"

inherit rpm
