SUMMARY = "Documentation for qt6-sensors in QCH format"
DESCRIPTION = "This package contains documentation for qt6-sensors in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-sensors-docs-qch-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "26a39ead5d0d0b0400b8f69aeb774d361bcbe881f60e0116a2032a4013b0c614565310df569626f42b638c92071b419ad180de72d2d872dab201f238c2a5531a"

RPROVIDES:${PN} += "qt6-sensors-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
