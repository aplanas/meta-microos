SUMMARY = "Icons for KDE Telepathy"
DESCRIPTION = "icons for all the KDE Telepathy packages."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "ktp-icons-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "6a45a4dfa8fc4ee57972d429b502c7a784cb5e227a563516026a028e6c1ab6deb34589ebd5d6c450afe935a7d6c19a92e60dcbd3233a10fa22e081dfa6810c36"

RPROVIDES:${PN} += "ktp-icons \
ktp-icons5"

RDEPENDS:${PN} += ""

inherit rpm
