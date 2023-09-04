SUMMARY = "HTML documentation for OpenWSMAN Ruby bindings"
DESCRIPTION = "This package provides HTML documentation for the OpenWSMAN Ruby \
bindings."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "openwsman-ruby-docs-2.7.2-2.9.noarch.rpm"
RPM_HASH = "dab69c2a0f055c8b4651225463e57a99f0a16001836d55588337909fb756667927ca35ebc21a35e8464129f612c3f71a36dc0a5df80548500b6e61216db0877e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openwsman-ruby-docs"

RDEPENDS:${PN} += ""

inherit rpm
