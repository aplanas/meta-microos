SUMMARY = "Enhanced Python `compileall` module"
DESCRIPTION = "Enhanced Python `compileall` module."
LICENSE = "Python-2.0"

PV = "0.7.2"

RPM_NAME = "python311-compileall2-0.7.2-1.6.noarch.rpm"
RPM_HASH = "e7363883576563cdb7f006ef2a799994f6f4922a297193066391d9e47604d4d435de834e31b449abdd1f1b5864d711100893f99333dd8e9263c8cded4789615f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-compileall2 \
python3.11dist-compileall2 \
python311-compileall2 \
python3dist-compileall2"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi"

inherit rpm
