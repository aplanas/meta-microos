SUMMARY = "SubRip (.srt) subtitle parser and writer"
DESCRIPTION = "pysrt is a python library to search and download subtitles. \
It comes with an easy to use CLI suitable for direct use or cron jobs."
LICENSE = "GPL-3.0-only"

PV = "1.1.2"

RPM_NAME = "python311-pysrt-1.1.2-3.14.noarch.rpm"
RPM_HASH = "25abcb0cc284622836c7379db54b8684bb123b6fa5fefb43f86fa5a5a80b645d986f89b2218eb9d479bac47a0b8f7050735c5a0a248c1a99729f0921f092a966"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pysrt) \
python311-pysrt \
python3dist(pysrt)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-chardet \
update-alternatives"

inherit rpm
