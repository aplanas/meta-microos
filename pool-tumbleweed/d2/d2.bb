SUMMARY = "CLI tool and modern declarative language that turns text to diagrams"
DESCRIPTION = "A modern declarative diagramming language that turns text to diagrams. Create \
beautiful diagrams in minutes. Simple syntax. Endlessly customizable. D2 is the \
fastest and easiest way to get a mental model from your head onto the screen, \
then make edits with your team."
LICENSE = "Apache-2.0 & MIT & MPL-2.0 & EPL-2.0 & GPL-2.0-or-later & BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "d2-0.6.0-2.1.aarch64.rpm"
RPM_HASH = "70945146566cfa70d7f15ee7c4f173fe0982cdadb9eacf4b259bd5bf832cb9305d3d4d8a87688794b6973a1dd6197fc1aa7af6cd14af49ffb939836a71affb94"

RPROVIDES:${PN} += "d2"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
