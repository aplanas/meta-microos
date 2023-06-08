SUMMARY = "Example code for Codec 2"
DESCRIPTION = "Example code for Codec 2, including test voices and matlab/octave files."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.0.5"

RPM_NAME = "codec2-examples-1.0.5-1.4.noarch.rpm"
RPM_HASH = "855e948f51c9ec5f87ddd8b6755d0296a0d3eb87a894c2031099205bfc2893c8e313e6bd7045db96142a84cedaf5ec4f8130e29c46e76927f6ae69d9b3ddce22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "codec2-examples"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/env /usr/bin/python3 codec2-devel"

inherit rpm
