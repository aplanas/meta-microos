SUMMARY = "Qt 6 MultimediaQuick library - Development files"
DESCRIPTION = "Development files for the Qt 6 Multimedia private library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-multimediaquick-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "784d6cc425de41e1aca1e95c5e4076392003f838dd22736f08530af0d5479e094e4ed1a8aa888e89bc728f42033b7926d2606c2a91cd3d5a5e08003fe707aba2"

RPROVIDES:${PN} += "cmake-Qt6MultimediaQuickPrivate \
qt6-multimediaquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick \
libQt6MultimediaQuick6 \
qt6-multimedia-private-devel"

inherit rpm
