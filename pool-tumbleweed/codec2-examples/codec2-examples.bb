SUMMARY = "Example code for Codec 2"
DESCRIPTION = "Example code for Codec 2, including test voices and matlab/octave files."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.1.0"

RPM_NAME = "codec2-examples-1.1.0-1.1.noarch.rpm"
RPM_HASH = "facb6e6ab90f608a597ef06a21731780028e1a38061f1376528d73c160b40e5f91973f3d4552c2942e5b50c1e7bbf019e995c891848f84fd8f973be5f940c5c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "codec2-examples"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
codec2-devel"

inherit rpm
