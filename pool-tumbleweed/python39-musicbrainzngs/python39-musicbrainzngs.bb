SUMMARY = "Python bindings for musicbrainz NGS webservice"
DESCRIPTION = "This library implements webservice bindings for the Musicbrainz NGS site, also \
known as /ws/2."
LICENSE = "BSD-2-Clause"

PV = "0.7.1"

RPM_NAME = "python39-musicbrainzngs-0.7.1-2.8.noarch.rpm"
RPM_HASH = "9a4c0f9319d82846dcc1bc5f8bbe500ebb6a1d138e5b55448d9c9e38fd29ed9f75a06e10c0e0c884e597e90aabf4a5f17d6888cb3368a6ca7d788ff99e35bc81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-musicbrainzngs \
python39-musicbrainzngs \
python3dist-musicbrainzngs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
