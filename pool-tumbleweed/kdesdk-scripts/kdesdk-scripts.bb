SUMMARY = "Scripts for KDE software development"
DESCRIPTION = "This package contains scripts useful for development of KDE software."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.3"

RPM_NAME = "kdesdk-scripts-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "cefa74bcdd53e83e6d9ec733778777e724b929aac312829718a5fd5b1d9a7683524558605498a15be90a57393ade9f51b4cec006e4e2047585f0db5f12bd5b60"

RPROVIDES:${PN} += "kde-dev-scripts \
kdesdk-scripts \
kdesdk4-scripts"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh"

inherit rpm
