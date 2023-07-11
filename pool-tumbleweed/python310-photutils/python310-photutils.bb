SUMMARY = "An Astropy package for photometry"
DESCRIPTION = "Photutils is an affiliated package of Astropy to provide tools for detecting \
and performing photometry of astronomical sources."
LICENSE = "BSD-3-Clause"

PV = "1.8.0"

RPM_NAME = "python310-photutils-1.8.0-1.3.aarch64.rpm"
RPM_HASH = "0ea3cae71977357693be4d53e70e68c815bb1aebbeafdc08c8cfe80d0711483a1537b6797e3bb3ea67c25ad41cba4fe59568cb1d193d35576540a096e57173ef"

RPROVIDES:${PN} += "python3.10dist-photutils \
python310-photutils \
python3dist-photutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-astropy \
python310-numpy"

inherit rpm
