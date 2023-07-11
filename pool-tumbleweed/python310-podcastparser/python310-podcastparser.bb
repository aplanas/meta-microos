SUMMARY = "A podcast parser"
DESCRIPTION = "The podcast parser project is a library from the gPodder project to provide a \
way of parsing RSS- and Atom-based podcast feeds in Python."
LICENSE = "ISC"

PV = "0.6.9"

RPM_NAME = "python310-podcastparser-0.6.9-1.5.noarch.rpm"
RPM_HASH = "7c64a570206dea9ae45f62f4c77010d4099b9b7103139b6fb3c68b7fe5996ab282d924995788e0ba2aa10863666c0c05a3363dbc015ab9c9cee5af3861e3b8be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-podcastparser \
python310-podcastparser \
python3dist-podcastparser"

RDEPENDS:${PN} += "python-abi \
python310-xml"

inherit rpm
