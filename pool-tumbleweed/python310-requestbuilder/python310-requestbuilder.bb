SUMMARY = "Command line-driven HTTP request builder"
DESCRIPTION = "Command line-driven HTTP request builder"
LICENSE = "ISC"

PV = "0.7.1"

RPM_NAME = "python310-requestbuilder-0.7.1-1.15.noarch.rpm"
RPM_HASH = "9262642b774e10f5fbf36aca64ecbe23f0f0cd0e81e1300e6532573c4434901ed86d4f45d1431caaa069965f91c1ce4254cda851441b189f013c7bd85ea76ceb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requestbuilder \
python3.10dist-requestbuilder \
python310-requestbuilder \
python3dist-requestbuilder"

RDEPENDS:${PN} += "python-abi"

inherit rpm
