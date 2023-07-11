SUMMARY = "CLI tool and modern declarative language that turns text to diagrams"
DESCRIPTION = "A modern declarative diagramming language that turns text to diagrams. Create \
beautiful diagrams in minutes. Simple syntax. Endlessly customizable. D2 is the \
fastest and easiest way to get a mental model from your head onto the screen, \
then make edits with your team."
LICENSE = "MPL-2.0"

PV = "0.5.1"

RPM_NAME = "d2-0.5.1-1.1.aarch64.rpm"
RPM_HASH = "56581b20095357a8132e4a12f024299b9de57f074f491d97910a82048184808aed8d53de621fe86faf786ee51206b34f482b2eaf815e84396a8fe50020f20686"

RPROVIDES:${PN} += "d2"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
