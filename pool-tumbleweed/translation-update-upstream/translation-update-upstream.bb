SUMMARY = "Tool for Translation Update from Upstream"
DESCRIPTION = "This is a tool providing update of translations using available \
upstream resources. \
 \
The tool tool is intended for use during package compilation as a first \
command after unpacking of source code. \
 \
For more see README and HOWTO. \
 \
This package also includes translation update data files."
LICENSE = "GPL-2.0-or-later"

PV = "20200601"

RPM_NAME = "translation-update-upstream-20200601-1.9.noarch.rpm"
RPM_HASH = "12f9468a2bdd18691ad4a40a4e433db20ee0edf8be1e39af3a3c0fb0e007135384144fe9b062d1992d8cf7323ec055fb008c4154c7abfc5bbb1790af976830ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "translation-update-tool \
translation-update-upstream"

RDEPENDS:${PN} += "/bin/bash \
coreutils \
gettext-tools \
grep \
intltool \
sed"

inherit rpm
