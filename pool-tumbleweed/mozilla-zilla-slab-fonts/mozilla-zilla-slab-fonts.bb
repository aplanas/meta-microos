SUMMARY = "A Slab Typeface from Mozilla"
DESCRIPTION = "A Slab Typeface from Mozilla. \
 \
Designers: Typotheque"
LICENSE = "OFL-1.1"

PV = "1.002"

RPM_NAME = "mozilla-zilla-slab-fonts-1.002-1.8.noarch.rpm"
RPM_HASH = "c317e7ce50f3c3bc39ad53e39671ae9ab19d97063171ed78c0a26572187d2c002cd93fa05d6b26f3f7041fb5f46992b7157ea4b884c77a3dcdd4265cb92fb125"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mozilla-zilla-slab-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
