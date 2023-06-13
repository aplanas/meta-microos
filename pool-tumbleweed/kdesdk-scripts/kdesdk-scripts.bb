SUMMARY = "Scripts for KDE software development"
DESCRIPTION = "This package contains scripts useful for development of KDE software."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.1"

RPM_NAME = "kdesdk-scripts-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "4bc2c4df7bbf3bbeb5190bc73e43feaaf6221a3703cd69716ef17206b74f20be6f53ae7788ba1335708b5bd91f39fa5b1c8d956d50d68b468d822dd5c08886bb"

RPROVIDES:${PN} += "kde-dev-scripts \
kdesdk-scripts \
kdesdk-scripts(aarch-64) \
kdesdk4-scripts"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/env \
/usr/bin/perl"

inherit rpm
