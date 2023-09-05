SUMMARY = "Development package for libkdepim"
DESCRIPTION = "The development package for the libkdepim libraries"
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libkdepim-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "d759f0481617c32a1fb008629a55397688b3ea49894751df9bd4afb2387878203eaf7aa3e51084b2890fd846300ddbed931735a1f14c8711aa2e39b55c3a1d0f"

RPROVIDES:${PN} += "cmake-KF5Libkdepim \
cmake-KPim5Libkdepim \
cmake-KPim5MailTransportDBusService \
cmake-MailTransportDBusService \
libkdepim-devel"

RDEPENDS:${PN} += "cmake-KPim5Akonadi \
cmake-KPim5AkonadiContact \
libKPim5Libkdepim5 \
libkdepim"

inherit rpm
