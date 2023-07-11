SUMMARY = "Documentation for the Tomoe handwriting recognition engine"
DESCRIPTION = "Japanese handwriting recognition engine (Tegaki Online MOji-ninshiki \
Engine)"
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "tomoe-doc-0.6.0-51.5.aarch64.rpm"
RPM_HASH = "a78e5f6b89fb218e4eecc106d52a828f97f423348aac7f9641788646bb2b55e731a1eab1920459a7ad0d7d57bfb92693443d5fba1038dfa67cd082024e842fef"

RPROVIDES:${PN} += "tomoe-doc"

RDEPENDS:${PN} += ""

inherit rpm
