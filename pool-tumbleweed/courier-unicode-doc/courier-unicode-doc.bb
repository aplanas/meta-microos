SUMMARY = "Courier Unicode Library - Docs and man pages"
DESCRIPTION = "This package contains the docs and the man pages of the Courier Unicode Library"
LICENSE = "GPL-3.0-or-later"

PV = "2.2.6"

RPM_NAME = "courier-unicode-doc-2.2.6-1.4.noarch.rpm"
RPM_HASH = "f69e34a644a805dcafc3b2b116cba38a227c593841d53675993bb077952f3726398e43ae2865ddeb864a86e599bdc0d48200e5fa37c4de62dd0518e3aaba8170"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "courier-unicode-doc"

RDEPENDS:${PN} += ""

inherit rpm
