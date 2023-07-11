SUMMARY = "SubRip (.srt) subtitle parser and writer"
DESCRIPTION = "pysrt is a python library to search and download subtitles. \
It comes with an easy to use CLI suitable for direct use or cron jobs."
LICENSE = "GPL-3.0-only"

PV = "1.1.2"

RPM_NAME = "python311-pysrt-1.1.2-3.16.noarch.rpm"
RPM_HASH = "ca3f3cb710cac21ef9019b1f762d5275e5fc88b1f7ad7b50dcb9dc8c51a06fb017c004e5fede7c2cc1ae29d53493cacec7366e505afc8f41436e47ae6600f75a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pysrt \
python3.11dist-pysrt \
python311-pysrt \
python3dist-pysrt"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-chardet \
update-alternatives"

inherit rpm
