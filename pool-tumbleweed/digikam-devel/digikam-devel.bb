SUMMARY = "DigiKam development files"
DESCRIPTION = "Development headers and libraries for digiKam."
LICENSE = "GPL-2.0-or-later"

PV = "8.1.0"

RPM_NAME = "digikam-devel-8.1.0-2.1.aarch64.rpm"
RPM_HASH = "57bf1c653136d18c83ac2d1632a3fdf5b738efaa530fcea57459c7f396cbdb3e2603c6e7bce4c1fda042d24229b8a44d788a69dc73941b9fd140d24c8fb44938"

RPROVIDES:${PN} += "cmake-DigikamCore \
cmake-DigikamDatabase \
cmake-DigikamGui \
cmake-DigikamPlugin \
digikam-devel"

RDEPENDS:${PN} += "libdigikamcore8-1-0"

inherit rpm
