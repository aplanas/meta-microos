SUMMARY = "Script to download subtitles for media files"
DESCRIPTION = "A script that allows to download subtitles for TV-Series, Anime and Movies from \
subscene and other sites."
LICENSE = "GPL-3.0-only"

PV = "1.0.4"

RPM_NAME = "python39-subgrab-1.0.4-1.19.noarch.rpm"
RPM_HASH = "2f8a0248567dcc3c784e46b122892f2afdfe0087cc870905d4cedb35452086cd5005cd6d8a77cb5db0580c9d2f3cb699954ea5f6a0f42be843820be69b601650"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-subgrab \
python39-subgrab \
python3dist-subgrab"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-beautifulsoup4 \
python39-lxml \
python39-requests \
update-alternatives"

inherit rpm
