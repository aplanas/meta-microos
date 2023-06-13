SUMMARY = "KDE PIM Libraries: Text edit functionality"
DESCRIPTION = "This package contains the basic packages for KDE PIM applications, in \
particular those related to editing text, like email messages."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kpimtextedit-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "400f3c6941ac9bff7be1e21435999bb944d9327f02856da71d6adb6a27de30e880aea391371602e232b777921a8a36fd24d906ec4af14ac074b4e645c0dee500"

RPROVIDES:${PN} += "kpimtextedit \
kpimtextedit(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
