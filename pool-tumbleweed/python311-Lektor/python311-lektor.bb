SUMMARY = "A static content management system"
DESCRIPTION = "A static content management system for building complex websites out \
of flat files for people who do not want to make a compromise between \
a CMS and a static blog engine."
LICENSE = "BSD-3-Clause"

PV = "3.3.7"

RPM_NAME = "python311-Lektor-3.3.7-1.7.noarch.rpm"
RPM_HASH = "827b9b8aff3be6b13b14004b4d48b314c622cca77c364044145e77250e00932bcc28454c3834b51691b244d7fd3f0db30efe7b712a63bf272be6386ec7c02db6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Lektor \
python3.11dist-lektor \
python311-Lektor \
python3dist-lektor"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Babel \
python311-ExifRead \
python311-Flask \
python311-Jinja2 \
python311-click \
python311-filetype \
python311-inifile \
python311-mistune \
python311-python-slugify \
python311-requests \
python311-setuptools \
python311-watchdog \
update-alternatives"

inherit rpm
