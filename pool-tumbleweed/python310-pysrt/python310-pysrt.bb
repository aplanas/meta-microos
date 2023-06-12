SUMMARY = "SubRip (.srt) subtitle parser and writer"
DESCRIPTION = "pysrt is a python library to search and download subtitles. \
It comes with an easy to use CLI suitable for direct use or cron jobs."
LICENSE = "GPL-3.0-only"

PV = "1.1.2"

RPM_NAME = "python310-pysrt-1.1.2-3.14.noarch.rpm"
RPM_HASH = "f777f4e5240a34852e7a57bed144baea30efcb96d8b5098fb1b02a007fcfb78afd302eeada6d0f3530b95a002a3b7e17125f457ad3a64738a2d57604c94e6978"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pysrt \
python3.10dist(pysrt) \
python310-pysrt \
python3dist(pysrt)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-chardet \
update-alternatives"

inherit rpm
