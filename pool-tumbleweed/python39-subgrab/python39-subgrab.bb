SUMMARY = "Script to download subtitles for media files"
DESCRIPTION = "A script that allows to download subtitles for TV-Series, Anime and Movies from \
subscene and other sites."
LICENSE = "GPL-3.0-only"

PV = "1.0.4"

RPM_NAME = "python39-subgrab-1.0.4-1.17.noarch.rpm"
RPM_HASH = "cd45d5b14e5efb3b29d445296823d8a849f328b833af9ed40f805306e282c2988682297083acaad2425cd5a804afbe2ea135dfad8f28f4bf15b5cf6d85fbca49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(subgrab) \
python39-subgrab \
python3dist(subgrab)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-beautifulsoup4 \
python39-lxml \
python39-requests \
update-alternatives"

inherit rpm
