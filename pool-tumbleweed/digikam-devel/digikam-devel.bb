SUMMARY = "DigiKam development files"
DESCRIPTION = "Development headers and libraries for digiKam."
LICENSE = "GPL-2.0-or-later"

PV = "8.0.0"

RPM_NAME = "digikam-devel-8.0.0-3.2.aarch64.rpm"
RPM_HASH = "33d0eeb56f94d8668f36f39cabd9e49faac8c5efe02b7dda0bb820d5f67eef0d65eb61e5f115ae15a85e14127bfda8c4636d0134aa931141811ebe06daf95ba0"

RPROVIDES:${PN} += "cmake(DigikamCore) \
cmake(DigikamDatabase) \
cmake(DigikamGui) \
cmake(DigikamPlugin) \
digikam-devel \
digikam-devel(aarch-64)"
RDEPENDS:${PN} += "libdigikamcore8_0_0"

inherit rpm
