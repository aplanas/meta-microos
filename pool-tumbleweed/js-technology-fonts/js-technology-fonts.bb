SUMMARY = "JS Technology fonts"
DESCRIPTION = "JS Technology fonts were initially created to support Thai language for desktop publishing in Windows operating system. \
Which was later adapted for sewing machine patterns."
LICENSE = "GPL-2.0+"

PV = "0.0+git.1515043414.01c39b7"

RPM_NAME = "js-technology-fonts-0.0+git.1515043414.01c39b7-1.9.noarch.rpm"
RPM_HASH = "8cf115d1cdf741f139c5a3b3feaf65a555740f72befa3ae39bd68344ad83381580acc80665b6a3de0b088880736b144a60eb548e79626f99f320c58d29fd5aff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "js-technology-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
