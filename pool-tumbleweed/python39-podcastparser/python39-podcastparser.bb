SUMMARY = "A podcast parser"
DESCRIPTION = "The podcast parser project is a library from the gPodder project to provide a \
way of parsing RSS- and Atom-based podcast feeds in Python."
LICENSE = "ISC"

PV = "0.6.9"

RPM_NAME = "python39-podcastparser-0.6.9-1.5.noarch.rpm"
RPM_HASH = "4e9a6a69187d73f914976ce9ea042886bac28e146d90910e742285782d196045cdd75b53b7cec1401dc85969fa2cf098d62e550ab7902443ab2b7a3aec12e22e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-podcastparser \
python39-podcastparser \
python3dist-podcastparser"

RDEPENDS:${PN} += "python-abi \
python39-xml"

inherit rpm
