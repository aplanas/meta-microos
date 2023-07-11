SUMMARY = "A library for locking devices"
DESCRIPTION = "The lockdev library provides a reliable way to put an exclusive lock \
on devices using both FSSTND and SVr4 methods. The lockdev-devel \
package contains the development headers."
LICENSE = "LGPL-2.0-only"

PV = "1.0.3_git201003141408"

RPM_NAME = "lockdev-devel-1.0.3_git201003141408-32.1.aarch64.rpm"
RPM_HASH = "e0f89dd1f85fbfc0115f96e769cecf78ef01abda1ebe79b5c425da43a81110a57c073322c876cbdecb730786d97988eeb9891464f630d3713922a386b2f31c4f"

RPROVIDES:${PN} += "lockdev-devel \
pkgconfig-lockdev"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lockdev"

inherit rpm
