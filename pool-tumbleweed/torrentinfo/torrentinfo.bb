SUMMARY = "Displays information contained in .torrent Files"
DESCRIPTION = "TorrentInfo is a command line script that parses .torrent files and displays \
the information contained within them. Currently, it can display a summary \
of the whole torrent, information on each file within the torrent, and a \
full hierarchical dump of the torrent file's contents."
LICENSE = "GPL-2.0-only"

PV = "1.8.6"

RPM_NAME = "torrentinfo-1.8.6-3.8.noarch.rpm"
RPM_HASH = "82b7f155983b33aec0f40a3bd9350e5facab9666e544139419fb37f721a0cc467d7b173a02ec832c4c41f8366854814d34d5fad102874b1c62fab04ab386781d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-torrentinfo \
python3dist-torrentinfo \
torrentinfo"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm
