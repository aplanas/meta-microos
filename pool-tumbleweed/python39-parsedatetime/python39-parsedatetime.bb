SUMMARY = "Python module to parse human-readable date/time text"
DESCRIPTION = "A Python module to parse human-readable date/time strings."
LICENSE = "Apache-2.0"

PV = "2.6"

RPM_NAME = "python39-parsedatetime-2.6-2.8.noarch.rpm"
RPM_HASH = "5f0361089ab65327ed41fc3781ec026085a077be976890ec52dd0a2200bb32aeb4afabf2ef4028667a0ef038aa0a11270e6e561a12c157c9191ff6e368f7ea10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-parsedatetime \
python39-parsedatetime \
python3dist-parsedatetime"

RDEPENDS:${PN} += "python-abi"

inherit rpm
