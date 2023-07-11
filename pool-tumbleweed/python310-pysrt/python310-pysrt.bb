SUMMARY = "SubRip (.srt) subtitle parser and writer"
DESCRIPTION = "pysrt is a python library to search and download subtitles. \
It comes with an easy to use CLI suitable for direct use or cron jobs."
LICENSE = "GPL-3.0-only"

PV = "1.1.2"

RPM_NAME = "python310-pysrt-1.1.2-3.16.noarch.rpm"
RPM_HASH = "df72ffc169254a170498f3cb078a14612c2b0a747bb7134cb1d4c6ef40eccb0b890953ef7d74a54bd0f7ea8271e525e426ec4e941221dfb91c2cffd88fae3e23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pysrt \
python310-pysrt \
python3dist-pysrt"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-chardet \
update-alternatives"

inherit rpm
