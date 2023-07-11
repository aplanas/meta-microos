SUMMARY = "Health-checker plugins for openSUSE Kubic"
DESCRIPTION = "This package contains health-checker plugins for testing that \
the openSUSE Kubic did boot correctly."
LICENSE = "GPL-2.0-only"

PV = "1.9"

RPM_NAME = "health-checker-plugins-kubic-1.9-1.1.noarch.rpm"
RPM_HASH = "61b6e18fee1b8e685785ce5b36d881dcd0a4b036b6e2020e695c017d23a12037c87956f7d5fd5cb96556f0b8379666994e4ac306ea4e041795eda905294eab73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "health-checker-plugins \
health-checker-plugins-kubic"

RDEPENDS:${PN} += "/usr/bin/bash \
health-checker"

inherit rpm
