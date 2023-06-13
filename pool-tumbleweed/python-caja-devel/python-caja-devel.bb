SUMMARY = "Python bindings for Caja - Development Files"
DESCRIPTION = "Development files needed for writing Caja Python extensions. \
 \
This package contains bindings to write Caja extensions with Python. \
It allows writing menu, property pages and column providers \
extensions, so that Caja functionality can be easily extended."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "python-caja-devel-1.26.0-1.10.aarch64.rpm"
RPM_HASH = "d5606acf763616f7645dd74aa23e902aa3e558293c3da29cb866ab9a54954f7b72f2bf5e3f58575d590e087b26083ce966473248bf4ba4876839077b1aa4ec4f"

RPROVIDES:${PN} += "pkgconfig(caja-python) \
python-caja-devel \
python-caja-devel(aarch-64) \
python-mate-file-manager-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
python-caja"

inherit rpm
