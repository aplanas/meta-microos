SUMMARY = "MIME email parser for KDE PIM - development files"
DESCRIPTION = "This package contains development headers needed to use MIME message parsing \
in KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "akonadi-mime-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "40b269d2043e92011b281810457d055aa6375623b55f58bd0f3ac7df5dca953837163c2e4f92ade29b598876e65e353afd2d0e7c79a3798af137b4f715d0e94b"

RPROVIDES:${PN} += "akonadi-mime-devel akonadi-mime-devel(aarch-64) cmake(KF5AkonadiMime) cmake(KPim5AkonadiMime)"
RDEPENDS:${PN} += "cmake(KPim5Akonadi) libKPim5AkonadiMime5"

inherit rpm
