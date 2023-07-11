SUMMARY = "Documentation for qt6-tools in QCH format"
DESCRIPTION = "This package contains documentation for qt6-tools in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-tools-docs-qch-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "db7c747d366f1f1f27757cb609f167f6e4651447a763be046318b8acfb55ed8ad2dd588fe6e72436353d1092e58b63f6fda4664dc5b894260e1344e43b70f396"

RPROVIDES:${PN} += "qt6-tools-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
