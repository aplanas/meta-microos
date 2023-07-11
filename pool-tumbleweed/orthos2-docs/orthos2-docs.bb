SUMMARY = "HTML documentation for orthos2"
DESCRIPTION = "HTML documentation that can be put into a web servers htdocs directory for publishing."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.169+git.a693485"

RPM_NAME = "orthos2-docs-1.2.169+git.a693485-1.2.noarch.rpm"
RPM_HASH = "2e5f0b313a2ff1c02a87939520e107f11cda0eee402ebf14e3bfc4379fbabbbc45287254e5b0527d4e576935d423498d83dc165d17300b5b10dfbb99be72eac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "orthos2-docs"

RDEPENDS:${PN} += ""

inherit rpm
