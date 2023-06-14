SUMMARY = "Azerbaijani (تورکجه) Dictionary for Aspell"
DESCRIPTION = "An Azerbaijani (تورکجه) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.02"

RPM_NAME = "aspell-az-0.02-2.14.aarch64.rpm"
RPM_HASH = "d496cd568d6127183503bf6bf51fabbfdd3e1d276cb24a6b06cde6de3e54381ad39e32a10cd3dde04451941a7cc993ababedc7b095e345e50f871d844346eddb"

RPROVIDES:${PN} += "aspell-az \
locale-aspell-az"

RDEPENDS:${PN} += ""

inherit rpm
