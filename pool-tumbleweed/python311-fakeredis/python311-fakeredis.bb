SUMMARY = "Fake implementation of redis API for testing purposes"
DESCRIPTION = "Fake implementation of redis API for testing purposes."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.15.0"

RPM_NAME = "python311-fakeredis-2.15.0-1.1.noarch.rpm"
RPM_HASH = "31280ee766551e518675efcdb97d977a1850c4f7de3251e28a0ac810f235da1472504ff78ab9eabf55b55059f337eea2ff8faeb8afb3ce29bb7f6dfb8da30722"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fakeredis \
python3.11dist-fakeredis \
python311-fakeredis \
python3dist-fakeredis"

RDEPENDS:${PN} += "python-abi \
python311-packaging \
python311-redis \
python311-sortedcontainers"

inherit rpm
