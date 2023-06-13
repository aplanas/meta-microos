SUMMARY = "RPM dependency generator for Python"
DESCRIPTION = "Tools for packaging Python projects with rpm"
LICENSE = "GPL-2.0-or-later"

PV = "20210526+a18ca48"

RPM_NAME = "python-rpm-packaging-20210526+a18ca48-1.8.noarch.rpm"
RPM_HASH = "65524e57339bef6a72cf4bf3e6c1e7f131dba3331a3250594e382f605973806618ce2b8b30070b41a7f2f490184afddd8a9ae9f072bbcfd130f98621cf3686ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-rpm-packaging \
rpm-build-python"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3 \
python-rpm-macros \
python3-base \
python3-packaging"

inherit rpm
