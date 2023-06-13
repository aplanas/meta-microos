SUMMARY = "Huastec (wastek) dictionary for Aspell"
DESCRIPTION = "A Huastec (wastek) dictionary for Aspell."
LICENSE = "GPL-3.0-only"

PV = "0.03.1"

RPM_NAME = "aspell-hus-0.03.1-2.14.aarch64.rpm"
RPM_HASH = "6aa0000628a5f8d071f249a36cad9fd7a84dd77695a4178e3a09fe31046edb482bdf81c26effc637d651ec3536574263233a8440c241d021a4b3eeb01cf617ca"

RPROVIDES:${PN} += "aspell-hus \
aspell-hus(aarch-64) \
locale(aspell:hus)"

RDEPENDS:${PN} += ""

inherit rpm
