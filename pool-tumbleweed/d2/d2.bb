SUMMARY = "CLI tool and modern declarative language that turns text to diagrams"
DESCRIPTION = "A modern declarative diagramming language that turns text to diagrams. Create \
beautiful diagrams in minutes. Simple syntax. Endlessly customizable. D2 is the \
fastest and easiest way to get a mental model from your head onto the screen, \
then make edits with your team."
LICENSE = "MPL-2.0"

PV = "0.6.0"

RPM_NAME = "d2-0.6.0-1.1.aarch64.rpm"
RPM_HASH = "6f617f8abd7b808a602c53ab7fe9939d76bd7edeca80087ad7995d9fb9c327170a118986dc7687ece0b9d16bf75d8d06ee61cecf993daee7c22827d6359625ff"

RPROVIDES:${PN} += "d2"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
