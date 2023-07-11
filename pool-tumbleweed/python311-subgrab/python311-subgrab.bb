SUMMARY = "Script to download subtitles for media files"
DESCRIPTION = "A script that allows to download subtitles for TV-Series, Anime and Movies from \
subscene and other sites."
LICENSE = "GPL-3.0-only"

PV = "1.0.4"

RPM_NAME = "python311-subgrab-1.0.4-1.19.noarch.rpm"
RPM_HASH = "2898d025385ed59a56fcf17052a3bb53312443c6afa1aa9a565cb87683918faca4670ecbf1cb0824b3104115e05fcaaae5d102e22c6cff0f0b62e1878d7fd2c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-subgrab \
python3.11dist-subgrab \
python311-subgrab \
python3dist-subgrab"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-beautifulsoup4 \
python311-lxml \
python311-requests \
update-alternatives"

inherit rpm
