SUMMARY = "A small INI library for Python"
DESCRIPTION = "A small INI library for Python."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "python311-inifile-0.4.1-1.8.noarch.rpm"
RPM_HASH = "71486ed5649c169a50d574f0cda4f4279e0ce3dcdf526b563bce3fb830498c81ee8a54424f810ec23fe5072f43d850f41e4fe37fea40d343187e705ffc63d7b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-inifile \
python3.11dist-inifile \
python311-inifile \
python3dist-inifile"

RDEPENDS:${PN} += "python-abi"

inherit rpm
