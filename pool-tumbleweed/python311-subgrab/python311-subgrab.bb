SUMMARY = "Script to download subtitles for media files"
DESCRIPTION = "A script that allows to download subtitles for TV-Series, Anime and Movies from \
subscene and other sites."
LICENSE = "GPL-3.0-only"

PV = "1.0.4"

RPM_NAME = "python311-subgrab-1.0.4-1.17.noarch.rpm"
RPM_HASH = "19cd8060b95776b399aba9eb10deb3dfc949ec147e2301aa3bdea802470332b364894be28e639294119380f0a989f3006e9fd7079dff0a0837f10cc606fb9996"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(subgrab) \
python311-subgrab \
python3dist(subgrab)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-beautifulsoup4 \
python311-lxml \
python311-requests \
update-alternatives"

inherit rpm
