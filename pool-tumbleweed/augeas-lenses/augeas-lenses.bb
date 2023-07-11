SUMMARY = "Official set of lenses for use by libaugeas"
DESCRIPTION = "Augeas parses configuration files described in lenses into a tree \
structure, which it exposes through its public API. Lenses are the \
building blocks of the file <-> tree transformation. The transformation \
is controlled by ``lens'' definitions that describe the file format and \
mapping of its contents into a tree. This package includes the official \
set of lenses."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13.0"

RPM_NAME = "augeas-lenses-1.13.0-2.2.aarch64.rpm"
RPM_HASH = "1fda47c4806b40befac6fcc4a408b1b3239de9a49e47ad072adfb2eb99638eebd3caeabd439eb36239e604e3022471aa5a37727eb2e4790e54b051fb917755d7"

RPROVIDES:${PN} += "augeas-lenses"

RDEPENDS:${PN} += "libaugeas0"

inherit rpm
