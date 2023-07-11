SUMMARY = "Documentation for kid3-qt"
DESCRIPTION = "This package provides documentation and help files for kid3-qt."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.3"

RPM_NAME = "kid3-qt-doc-3.9.3-1.4.aarch64.rpm"
RPM_HASH = "8a78325ebb06122fb185fc7739ef7ec054fc8f798c9a289fede0f25eee451022e857788281b91205f0de1de02f26efa3d564481b0afa7fd9397e800c91897473"

RPROVIDES:${PN} += "kid3-qt-doc"

RDEPENDS:${PN} += "kid3-qt"

inherit rpm
