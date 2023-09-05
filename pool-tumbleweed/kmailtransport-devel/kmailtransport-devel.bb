SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kmailtransport-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "a5fc26efaf4b9d69ac78d4ec979b33a50b25905e2464a1eb49890edcc67a6facf785a8def5d832720d415da7f4b398ed1b03797773e4e7bf377d182d62ab557b"

RPROVIDES:${PN} += "cmake-KF5MailTransport \
cmake-KPim5MailTransport \
kmailtransport-devel"

RDEPENDS:${PN} += "cmake-KF5Wallet \
cyrus-sasl-devel \
libKPim5MailTransport5"

inherit rpm
