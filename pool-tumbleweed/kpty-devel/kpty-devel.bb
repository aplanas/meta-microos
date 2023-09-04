SUMMARY = "Development files for kpty, a pseudo terminal device interface"
DESCRIPTION = "This library provides primitives to interface with pseudo terminal devices \
as well as a KProcess derived class for running child processes and \
communicating with them using a pty."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kpty-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "b660af51030474b719e7cdb9b3b5a3485573c6652c8ef2adc82c69fcc4ebe1389891df9a541e878331682c457a3233fb88b9062d80a714177b13c85f13ab77fb"

RPROVIDES:${PN} += "cmake-KF5Pty \
kpty-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
cmake-Qt5Core \
extra-cmake-modules \
libKF5Pty5"

inherit rpm
