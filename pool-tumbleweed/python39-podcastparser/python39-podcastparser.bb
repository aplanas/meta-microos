SUMMARY = "A podcast parser"
DESCRIPTION = "The podcast parser project is a library from the gPodder project to provide a \
way of parsing RSS- and Atom-based podcast feeds in Python."
LICENSE = "ISC"

PV = "0.6.9"

RPM_NAME = "python39-podcastparser-0.6.9-1.3.noarch.rpm"
RPM_HASH = "62c0f33904a6dc06580551fdceb87cab7e012990706b129c28bb01ac4d2ee4a71fb119b2500ccd447dbb70c862b2962b4d046624a64ebcb79acfb02a7d12b751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-podcastparser \
python39-podcastparser \
python3dist-podcastparser"

RDEPENDS:${PN} += "python-abi \
python39-xml"

inherit rpm
