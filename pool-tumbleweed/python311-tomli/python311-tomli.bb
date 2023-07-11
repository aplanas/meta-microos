SUMMARY = "A lil' TOML parser"
DESCRIPTION = "Tomli is a Python library for parsing TOML"
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python311-tomli-2.0.1-2.3.noarch.rpm"
RPM_HASH = "070507965ac5ff9c3972c44bfb297dc2bd6304beabff251a2e2a3fd1e0bd393e2fca6a3245b36bc595b6d883ea03e164c78e986d4c52e56671ffbdb2a228516f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tomli \
python3.11dist-tomli \
python311-tomli \
python3dist-tomli"

RDEPENDS:${PN} += "python-abi"

inherit rpm
