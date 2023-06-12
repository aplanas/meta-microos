SUMMARY = ".NET library for the Google Data API"
DESCRIPTION = "This package provides a simple protocol for the Google Data APIs (GData)."
LICENSE = "Apache-2.0"

PV = "1.4.0.2"

RPM_NAME = "gdata-sharp-devel-1.4.0.2-26.14.noarch.rpm"
RPM_HASH = "775899a75723944a2308cab719d5f62b464f183b2efcbda67c853e3807247f698bba95f0f51969fabf65853c7b5cc56e3451e40413ab98003b73fc2b8abf3c15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdata-sharp-devel \
pkgconfig(gdata-sharp-acl) \
pkgconfig(gdata-sharp-apps) \
pkgconfig(gdata-sharp-base) \
pkgconfig(gdata-sharp-blogger) \
pkgconfig(gdata-sharp-calendar) \
pkgconfig(gdata-sharp-codesearch) \
pkgconfig(gdata-sharp-contacts) \
pkgconfig(gdata-sharp-core) \
pkgconfig(gdata-sharp-documents) \
pkgconfig(gdata-sharp-health) \
pkgconfig(gdata-sharp-photos) \
pkgconfig(gdata-sharp-spreadsheets) \
pkgconfig(gdata-sharp-youtube)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
gdata-sharp \
pkgconfig(gdata-sharp-acl) \
pkgconfig(gdata-sharp-core)"

inherit rpm
