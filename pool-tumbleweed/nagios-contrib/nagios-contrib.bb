SUMMARY = "Files from the contrib directory"
DESCRIPTION = "This package contains all the files from the contrib directory"
LICENSE = "GPL-2.0-or-later"

PV = "4.4.7"

RPM_NAME = "nagios-contrib-4.4.7-2.4.aarch64.rpm"
RPM_HASH = "95e344311721827e3ce0d347d87f0b97d35db901ce4d22b2df30f166d61b895f897131b6ff25e261635cd8036ec71bc02d23c8b93bdadfa6fe6a28e99416c36e"

RPROVIDES:${PN} += "nagios-contrib \
nagios-contrib(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
nagios"

inherit rpm
