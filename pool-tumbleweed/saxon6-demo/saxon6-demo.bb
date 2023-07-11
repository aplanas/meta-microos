SUMMARY = "Demos for saxon6"
DESCRIPTION = "Demonstrations and samples for saxon6."
LICENSE = "MPL-1.0"

PV = "6.5.5"

RPM_NAME = "saxon6-demo-6.5.5-16.7.noarch.rpm"
RPM_HASH = "a36979e537deb1619ee091035cb8540987105fc0e60e6b2a08cae5d90b029ec333375a4442ea482edb2e05a1a322d76c8eacb1b80f545c95d998f06f13def902"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "saxon6-demo"

RDEPENDS:${PN} += "saxon6"

inherit rpm
