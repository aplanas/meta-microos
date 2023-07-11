SUMMARY = "A static content management system"
DESCRIPTION = "A static content management system for building complex websites out \
of flat files for people who do not want to make a compromise between \
a CMS and a static blog engine."
LICENSE = "BSD-3-Clause"

PV = "3.3.7"

RPM_NAME = "python39-Lektor-3.3.7-1.7.noarch.rpm"
RPM_HASH = "d622cb967db68cfa2ea175b97d89c05058926b8b698e6844d4ba099b9f5d83f0053d0d5701e294130f0d1929304b0d3f65ac0cb98ef8c950adb53bc1ec5f1bf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-lektor \
python39-Lektor \
python3dist-lektor"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
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
