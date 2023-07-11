SUMMARY = "Python library to search and download subtitles"
DESCRIPTION = "Subliminal is a python library to search and download subtitles. \
It comes with an easy to use CLI suitable for direct use or cron jobs."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python3-subliminal-2.1.0-3.7.noarch.rpm"
RPM_HASH = "65070e6a2d54cc0f1aa3f5569f441ea47b3f73ab7763b14a58ff08e8ec0c6f129c2094bef7e66c90442899d05bc85499868aaecdf73bcd759cb8343852a46d58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-subliminal \
python3.11dist-subliminal \
python3dist-subliminal \
subliminal"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-appdirs \
python3-babelfish \
python3-beautifulsoup4 \
python3-chardet \
python3-click \
python3-dogpile.cache \
python3-enzyme \
python3-guessit \
python3-pysrt \
python3-pytz \
python3-rarfile \
python3-requests \
python3-six \
python3-stevedore \
update-alternatives"

inherit rpm
