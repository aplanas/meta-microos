SUMMARY = "Additional EBCDIC codecs for Python"
DESCRIPTION = "Additional EBCDIC codecs for Python."
LICENSE = "BSD-2-Clause"

PV = "1.1.1"

RPM_NAME = "python311-ebcdic-1.1.1-2.10.noarch.rpm"
RPM_HASH = "cb18d1ef2e454515fd79e8e39f5479a4bbba288900072f2e91f7b6a86882beef2a762a34c27a665da152174bb4310972294a57785770dfa404065c567a263ba1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ebcdic \
python3.11dist-ebcdic \
python311-ebcdic \
python3dist-ebcdic"

RDEPENDS:${PN} += "python-abi"

inherit rpm
