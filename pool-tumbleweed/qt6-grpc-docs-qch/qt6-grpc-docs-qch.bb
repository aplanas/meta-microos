SUMMARY = "Documentation for qt6-grpc in QCH format"
DESCRIPTION = "This package contains documentation for qt6-grpc in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-grpc-docs-qch-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "89e061402bd6ddc9d790fb3f2183e23365fa1af71fbc42c149cd0f79e19e1a7e4c07ff268ba9ade5628621c8ae7492d18a145d9dfcfc61be8eda88d469e1e6dc"

RPROVIDES:${PN} += "qt6-grpc-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
