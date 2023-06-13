SUMMARY = "Console screen"
DESCRIPTION = "This package allows to run multiple consoles in one 'screen' and \
to start the screen automatically during boot."
LICENSE = "BSD-4-Clause"

PV = "1.4"

RPM_NAME = "cscreen-1.4-1.5.noarch.rpm"
RPM_HASH = "a06b6daba9406bd6013df8a2e4f009bf1a33af351fc11d02237e32888986a1f6c9813c695bc89e6bcf984c1720e53263131b5291c92536acbd5b99178700a9c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(cscreen) \
cscreen"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
coreutils \
screen \
shadow \
sudo"

inherit rpm
