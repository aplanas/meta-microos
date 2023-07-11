SUMMARY = "Script to download subtitles for media files"
DESCRIPTION = "A script that allows to download subtitles for TV-Series, Anime and Movies from \
subscene and other sites."
LICENSE = "GPL-3.0-only"

PV = "1.0.4"

RPM_NAME = "python310-subgrab-1.0.4-1.19.noarch.rpm"
RPM_HASH = "164ff465d586257fffa889aaa0071f549a498ea05550090b5b7f45869985def68fd1abad2251a08f96bb2f134871300f437d56fe63425fa53716d704d3ccadcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-subgrab \
python310-subgrab \
python3dist-subgrab"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-beautifulsoup4 \
python310-lxml \
python310-requests \
update-alternatives"

inherit rpm
