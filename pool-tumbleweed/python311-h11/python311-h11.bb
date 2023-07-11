SUMMARY = "A pure-Python, bring-your-own-I/O implementation of HTTP/11"
DESCRIPTION = "This is a little HTTP/1.1 library written from scratch in Python, \
heavily inspired by hyper-h2 <https://hyper-h2.readthedocs.io>"
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python311-h11-0.14.0-2.3.noarch.rpm"
RPM_HASH = "b9ca4dc6332a8113964c899fe9a3192e2b061b7d7b14fbd676eec3f629deebda695e909620d14815042980fe948035635e84363c92cfa34f471e3e948f69cfed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-h11 \
python3.11dist-h11 \
python311-h11 \
python3dist-h11"

RDEPENDS:${PN} += "python-abi"

inherit rpm
