SUMMARY = "A podcast parser"
DESCRIPTION = "The podcast parser project is a library from the gPodder project to provide a \
way of parsing RSS- and Atom-based podcast feeds in Python."
LICENSE = "ISC"

PV = "0.6.9"

RPM_NAME = "python310-podcastparser-0.6.9-1.3.noarch.rpm"
RPM_HASH = "5254ec275e40a65225c1193014c922a67eb166cbc9cad3413a6bdac6c47344bd381bd6eeaf2b7f91a77def9494646ef7558afd80f996f1787c21b9a335e6a354"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-podcastparser \
python3.10dist(podcastparser) \
python310-podcastparser \
python3dist(podcastparser)"

RDEPENDS:${PN} += "python(abi) \
python310-xml"

inherit rpm
