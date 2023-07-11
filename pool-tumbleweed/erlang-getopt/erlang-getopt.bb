SUMMARY = "Command-line parsing module similar to getopt"
DESCRIPTION = "Command-line parsing module that uses a syntax similar to that of GNU getopt."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "erlang-getopt-1.0.2-1.2.aarch64.rpm"
RPM_HASH = "83d65a63cb2385329b6ef679a41211b4efbdff9c415fa536c483ddab9aa87e13384342ec21b47f2bfd748d77695a69eb07f2f11e9e15c5d21a7ee1789e0c3c4d"

RPROVIDES:${PN} += "erlang-getopt"

RDEPENDS:${PN} += "erlang"

inherit rpm
