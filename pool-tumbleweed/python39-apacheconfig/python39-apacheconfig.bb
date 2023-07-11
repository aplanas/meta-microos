SUMMARY = "Apache config file parser"
DESCRIPTION = "Apache / Config::General configuration file parser"
LICENSE = "BSD-2-Clause"

PV = "0.3.2"

RPM_NAME = "python39-apacheconfig-0.3.2-1.1.noarch.rpm"
RPM_HASH = "6ef5bd75afa70be9cd670b89183e9c6e355ab7c6ec44fa43c912cdfa63eb69bbe32d6709f8b8bd29a22595f770f4ba87e3010b3449ece7c5b7cf0fd34cdcc28e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-apacheconfig \
python39-apacheconfig \
python3dist-apacheconfig"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-ply \
python39-six \
update-alternatives"

inherit rpm
