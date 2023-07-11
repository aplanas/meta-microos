SUMMARY = "Apache config file parser"
DESCRIPTION = "Apache / Config::General configuration file parser"
LICENSE = "BSD-2-Clause"

PV = "0.3.2"

RPM_NAME = "python310-apacheconfig-0.3.2-1.1.noarch.rpm"
RPM_HASH = "9f39743338c97a6cb8ca5b11f134e1d0ec7a9db739cb3388bf81ad8d7a10ef8a42ce07b05305cd16db566e0be871e88b3e07683e5a790f87e8e69d42e36e675d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-apacheconfig \
python310-apacheconfig \
python3dist-apacheconfig"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-ply \
python310-six \
update-alternatives"

inherit rpm
