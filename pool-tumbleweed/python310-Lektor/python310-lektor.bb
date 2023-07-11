SUMMARY = "A static content management system"
DESCRIPTION = "A static content management system for building complex websites out \
of flat files for people who do not want to make a compromise between \
a CMS and a static blog engine."
LICENSE = "BSD-3-Clause"

PV = "3.3.7"

RPM_NAME = "python310-Lektor-3.3.7-1.7.noarch.rpm"
RPM_HASH = "b110781efc5ad6784980f409791450d5c32788869e4a2129e57aca59ee6f1069bbfd4cf265610953c57e9b2850271852883dc14c798ad06a297bffd5f46831f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-lektor \
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
