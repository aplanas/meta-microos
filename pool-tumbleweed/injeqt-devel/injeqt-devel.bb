SUMMARY = "Dependency injection framework for Qt"
DESCRIPTION = "injeqt is an attempt to build a powerful and reliable dependency injection \
framework on Qt's reflection based on MOC (meta-object compiler). \
 \
Files mandatory for development."
LICENSE = "LGPL-2.1+"

PV = "1.2.0"

RPM_NAME = "injeqt-devel-1.2.0-1.28.aarch64.rpm"
RPM_HASH = "2e660b42daaa3b3f4629d960fc533a4d3fd8e710961400a723026be8c767d68f703b77c36c8790e7f4a101f9297bb200120a6347d12cf28e7c06d0721a486cc5"

RPROVIDES:${PN} += "injeqt-devel \
injeqt-devel(aarch-64) \
pkgconfig(injeqt)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libinjeqt1"

inherit rpm
