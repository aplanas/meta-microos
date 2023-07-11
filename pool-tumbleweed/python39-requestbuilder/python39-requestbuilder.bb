SUMMARY = "Command line-driven HTTP request builder"
DESCRIPTION = "Command line-driven HTTP request builder"
LICENSE = "ISC"

PV = "0.7.1"

RPM_NAME = "python39-requestbuilder-0.7.1-1.17.noarch.rpm"
RPM_HASH = "e6e49b1db3f99fdced1e10f52ec90995684a3b3e95cc9af47b36320425648029210cfbdd2d0f12358767108d4245c756c626bff0a6745555b50d1e906c7f9e5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requestbuilder \
python39-requestbuilder \
python3dist-requestbuilder"

RDEPENDS:${PN} += "python-abi"

inherit rpm
