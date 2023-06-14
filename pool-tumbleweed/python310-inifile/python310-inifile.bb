SUMMARY = "A small INI library for Python"
DESCRIPTION = "A small INI library for Python."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "python310-inifile-0.4.1-1.7.noarch.rpm"
RPM_HASH = "96b0e02bc3e5ca5eb89afc314beb268445667e50e87bebef8a2b3a84b597b54b814481ee3083f91c4a250c295c9578c590b19d89e4b2870091cbf73b2293000a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-inifile \
python3.10dist-inifile \
python310-inifile \
python3dist-inifile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
