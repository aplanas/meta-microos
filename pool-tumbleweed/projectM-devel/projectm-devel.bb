SUMMARY = "Development Files for projectM"
DESCRIPTION = "projectM is a music visualizer. \
This package contains its development files."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.12"

RPM_NAME = "projectM-devel-3.1.12-1.12.aarch64.rpm"
RPM_HASH = "1a0bee52c8493cf225d2b4d86755caf5606196c639117c79c7c144cc782ea8ef1e355eeae657ca1b5a60e7b246f11ff6fc748f1a9c54085db6ae16ab2607c79b"

RPROVIDES:${PN} += "pkgconfig(libprojectM) \
projectM-devel \
projectM-devel(aarch-64) \
projectM-qt5-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libprojectM3 \
projectM \
projectM-data"

inherit rpm
