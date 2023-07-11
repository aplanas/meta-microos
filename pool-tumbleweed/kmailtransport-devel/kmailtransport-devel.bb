SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kmailtransport-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "8b719b83f24bfc0be169e9e56583020fdc15bad6ec4e169c57edc3ff4a2e9ce838c789d1cf803c17dd54c409737976c5c94a49722b1e95a0cbb261a9f60baa5e"

RPROVIDES:${PN} += "cmake-KF5MailTransport \
cmake-KF5MailTransportAkonadi \
cmake-KPim5MailTransport \
cmake-KPim5MailTransportAkonadi \
kmailtransport-devel"

RDEPENDS:${PN} += "cmake-KF5Wallet \
cmake-KPim5AkonadiMime \
cmake-KPim5Mime \
cyrus-sasl-devel \
libKPim5MailTransport5 \
libKPim5MailTransportAkonadi5"

inherit rpm
