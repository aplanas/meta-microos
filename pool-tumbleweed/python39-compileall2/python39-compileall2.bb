SUMMARY = "Enhanced Python `compileall` module"
DESCRIPTION = "Enhanced Python `compileall` module."
LICENSE = "Python-2.0"

PV = "0.7.2"

RPM_NAME = "python39-compileall2-0.7.2-1.6.noarch.rpm"
RPM_HASH = "9fab511b1b78493fc103899f16f2a843c04dede2e3e05b68c44de429acc896e34c9bfaa4182bb2b25e3d2955e5664739da70ef95712f9cdc88b51ed53e5f975f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-compileall2 \
python39-compileall2 \
python3dist-compileall2"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi"

inherit rpm
