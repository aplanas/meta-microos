SUMMARY = "ALSA UCM Profiles"
DESCRIPTION = "This package contains the profiles files for ALSA UCM (Use Case Manager)."
LICENSE = "BSD-3-Clause"

PV = "1.2.9"

RPM_NAME = "alsa-ucm-conf-1.2.9-1.1.noarch.rpm"
RPM_HASH = "d022412c65c146d27f4cb97d54d21864f1e95c70e42463dd13f6e11ca1038c8d0552bd37b0e7990bdb419c7e633e7f1aa07eda3f1dfa93b438f6839155facd44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alsa-ucm-conf"

RDEPENDS:${PN} += "libasound2"

inherit rpm
