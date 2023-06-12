SUMMARY = "Displays information contained in .torrent Files"
DESCRIPTION = "TorrentInfo is a command line script that parses .torrent files and displays \
the information contained within them. Currently, it can display a summary \
of the whole torrent, information on each file within the torrent, and a \
full hierarchical dump of the torrent file's contents."
LICENSE = "GPL-2.0-only"

PV = "1.8.6"

RPM_NAME = "torrentinfo-1.8.6-3.7.noarch.rpm"
RPM_HASH = "c9923c017464be1f325c8b42ba26aec26d64db84332584684e3aac392ed2464e2c768d893e693efde336ab51361e5a9e69f758e4fe772cf84171e981ab94bd5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(torrentinfo) \
python3dist(torrentinfo) \
torrentinfo"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi)"

inherit rpm
