SUMMARY = "Documentation for qt6-lottie in QCH format"
DESCRIPTION = "This package contains documentation for qt6-lottie in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-lottie-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "c630629d57e0559f44a29e72333fb1f3814847570c81fe44cfe9a31c7b6169121c34790c638f948560153558c244ac4fdf7caf52b2d49fc633269618cbdfcd87"

RPROVIDES:${PN} += "qt6-lottie-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
