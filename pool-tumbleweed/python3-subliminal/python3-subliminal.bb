SUMMARY = "Python library to search and download subtitles"
DESCRIPTION = "Subliminal is a python library to search and download subtitles. \
It comes with an easy to use CLI suitable for direct use or cron jobs."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python3-subliminal-2.1.0-3.6.noarch.rpm"
RPM_HASH = "3d4ffcd83cf4ae87943f2da16cac425f53720437edceea24a46466f959467d0e1d268e5ed613eb8cf181dccc302cf951b84d9a343be79c3572896186f18cdb54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-subliminal \
python3.10dist(subliminal) \
python3dist(subliminal) \
subliminal"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
python(abi) \
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
