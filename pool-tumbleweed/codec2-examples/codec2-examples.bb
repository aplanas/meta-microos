SUMMARY = "Example code for Codec 2"
DESCRIPTION = "Example code for Codec 2, including test voices and matlab/octave files."
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "codec2-examples-1.2.0-1.1.noarch.rpm"
RPM_HASH = "d2d57de006c7d1f1f6b0351fb0f028a3e75798540006a38a228dad9fa00ba2b13eea66033fb3e64d17f8f9ec3f2348c0eeb0d52d94d0d808d4cfd9a9016ed895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "codec2-examples"

RDEPENDS:${PN} += ""

inherit rpm
