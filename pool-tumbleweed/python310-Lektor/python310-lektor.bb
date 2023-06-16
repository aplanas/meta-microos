SUMMARY = "A static content management system"
DESCRIPTION = "A static content management system for building complex websites out \
of flat files for people who do not want to make a compromise between \
a CMS and a static blog engine."
LICENSE = "BSD-3-Clause"

PV = "3.3.7"

RPM_NAME = "python310-Lektor-3.3.7-1.5.noarch.rpm"
RPM_HASH = "e79131a0a7521c7c9a9872082497d8a781b73383cde9e745ccf89cc063a99517faf357a134322838dc56c293b5b8c26f0ab0f7100cc63aa8bd7ec6305493d70f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Lektor \
python3.10dist-lektor \
python310-Lektor \
python3dist-lektor"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Babel \
python310-ExifRead \
python310-Flask \
python310-Jinja2 \
python310-click \
python310-filetype \
python310-inifile \
python310-mistune \
python310-python-slugify \
python310-requests \
python310-setuptools \
python310-watchdog \
update-alternatives"

inherit rpm
