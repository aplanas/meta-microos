SUMMARY = "Sans Forgetica Font"
DESCRIPTION = "Sans Forgetica is more difficult to read than most typefaces – and that's by design. \
The 'desirable difficulty' you experience whee reading information formatted in \
Sans Forgetica prompts your brain to engage in deeper processing. Sans Forgetica is \
designed for non-commercial use only. It is bound by a creative commons, non-commercial, \
attributed (CCBYNC) license."
LICENSE = "CC-BY-NC-4.0"

PV = "1.000"

RPM_NAME = "rmit-sansforgetica-fonts-1.000-1.10.noarch.rpm"
RPM_HASH = "4306f66e642ae419bc14e3eddb6df46604e9e415eb98023273d67bc6251a4d1de5c0b9d3e973476eb90eafbbf0a219d89f6d6d287be2a12cdd8276890fc591f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rmit-sansforgetica-fonts"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
