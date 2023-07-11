SUMMARY = "Example code for Codec 2"
DESCRIPTION = "Example code for Codec 2, including test voices and matlab/octave files."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.1.1"

RPM_NAME = "codec2-examples-1.1.1-1.1.noarch.rpm"
RPM_HASH = "e086a8e3152a4c76be9033e1e2448af611261795bd38afb00607633f783bb1ce7f6320a60bd8ed9fba482d5b81b6cdf00a5e8ea93735725d8d3953a714bd8050"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "codec2-examples"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
codec2-devel"

inherit rpm
