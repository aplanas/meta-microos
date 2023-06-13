SUMMARY = "POSIX compatible regexp library with approximate matching"
DESCRIPTION = "TRE is a lightweight, robust, and efficient POSIX compatible regexp \
matching library with some exciting features such as approximate \
matching."
LICENSE = "BSD-3-Clause"

PV = "0.8.0_git201402282055"

RPM_NAME = "tre-devel-0.8.0_git201402282055-7.2.aarch64.rpm"
RPM_HASH = "2f5a2b985c245ac0c757731cdc7f8662f6e20cfd8ca811c3de7b95d4ede6a060b8b60c7cec1b2ed92d2805b0e502d90c143c55a041940ef3c69d727f10e3b1d0"

RPROVIDES:${PN} += "libtre-devel \
pkgconfig(tre) \
tre-devel \
tre-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtre5"

inherit rpm
