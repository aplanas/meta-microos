SUMMARY = "KDE Konqueror Libraries: Build Environment"
DESCRIPTION = "Development package for the konqueror libraries."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "konqueror-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "41e26ca838b8cde7abac48b0f619e27fb3ea2a7e87b2f5bf88bb5af6d7f92c16e5322ca1855532eb87cf413cc7afbe91b627f93adc8413bea9979f0a446cc699"

RPROVIDES:${PN} += "cmake-KF5Konq \
kde-baseapps-devel \
kde-baseapps5-devel \
konqueror-devel \
libkonq-devel"

RDEPENDS:${PN} += "konqueror"

inherit rpm
