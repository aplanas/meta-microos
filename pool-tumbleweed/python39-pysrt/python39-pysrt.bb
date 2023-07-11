SUMMARY = "SubRip (.srt) subtitle parser and writer"
DESCRIPTION = "pysrt is a python library to search and download subtitles. \
It comes with an easy to use CLI suitable for direct use or cron jobs."
LICENSE = "GPL-3.0-only"

PV = "1.1.2"

RPM_NAME = "python39-pysrt-1.1.2-3.16.noarch.rpm"
RPM_HASH = "6d051257d72b2816dfe2652665d83064eba969ef584eedeb6356cd10759052059ec5118615d459282a33f4af8fae424d371294e82421410b8b1019ed1283ad10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pysrt \
python39-pysrt \
python3dist-pysrt"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-chardet \
update-alternatives"

inherit rpm
