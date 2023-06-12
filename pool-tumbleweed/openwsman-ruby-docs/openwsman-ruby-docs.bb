SUMMARY = "HTML documentation for OpenWSMAN Ruby bindings"
DESCRIPTION = "This package provides HTML documentation for the OpenWSMAN Ruby \
bindings."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "openwsman-ruby-docs-2.7.2-2.5.noarch.rpm"
RPM_HASH = "255749c9b1a0bc20b17ea2199b0e605b25bde10d21d833f7a07f9bcffbd622aa2850deb5bfb5ed1458ea77914b018d852d62066cf05f0b2debd20854d237feca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openwsman-ruby-docs"
RDEPENDS:${PN} += ""

inherit rpm
