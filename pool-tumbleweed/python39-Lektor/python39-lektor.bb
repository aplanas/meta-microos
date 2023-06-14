SUMMARY = "A static content management system"
DESCRIPTION = "A static content management system for building complex websites out \
of flat files for people who do not want to make a compromise between \
a CMS and a static blog engine."
LICENSE = "BSD-3-Clause"

PV = "3.3.7"

RPM_NAME = "python39-Lektor-3.3.7-1.5.noarch.rpm"
RPM_HASH = "92f9492c5b44432da2043427b16c320b6d7f8eb52917cbb9e9f51c8e81b6e8b5ba0da48f51abcb8a820c2f97caca0482db3001d0b83f929060f5a5ebc86504e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-lektor \
python39-Lektor \
python3dist-lektor"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-Babel \
python39-ExifRead \
python39-Flask \
python39-Jinja2 \
python39-click \
python39-filetype \
python39-inifile \
python39-mistune \
python39-python-slugify \
python39-requests \
python39-setuptools \
python39-watchdog \
update-alternatives"

inherit rpm
