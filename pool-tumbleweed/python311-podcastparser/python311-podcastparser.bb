SUMMARY = "A podcast parser"
DESCRIPTION = "The podcast parser project is a library from the gPodder project to provide a \
way of parsing RSS- and Atom-based podcast feeds in Python."
LICENSE = "ISC"

PV = "0.6.9"

RPM_NAME = "python311-podcastparser-0.6.9-1.5.noarch.rpm"
RPM_HASH = "a43ee336ba4b1abdc57a3db9be0ebd6262e2c0bb45843c11ca5bb4e16e1a74fee3a1205478dd0f95f418d4b33b9bc719858823488fe448a6f9de089507d83d56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-podcastparser \
python3.11dist-podcastparser \
python311-podcastparser \
python3dist-podcastparser"

RDEPENDS:${PN} += "python-abi \
python311-xml"

inherit rpm
