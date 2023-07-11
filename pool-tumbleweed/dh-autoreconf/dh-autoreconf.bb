SUMMARY = "Add-on for debhelper to call autoreconf and clean up after the build"
DESCRIPTION = "dh-autoreconf provides a debhelper sequence addon named 'autoreconf' and \
two commands, dh_autoreconf and dh_autoreconf_clean. \
 \
The dh_autoreconf command creates a list of the files and their checksums, \
calls autoreconf and then creates a second list for the new files. \
 \
The dh_autoreconf_clean command compares these two lists and removes all \
files which have been added or changed (files may be excluded if needed). \
 \
For CDBS users, a rule is provided to call the dh-autoreconf programs at \
the right time."
LICENSE = "GPL-2.0-or-later"

PV = "19"

RPM_NAME = "dh-autoreconf-19-3.11.noarch.rpm"
RPM_HASH = "95e4e4ab71a137bab03927dd32ccbcdaef779d1f7eecfdf583a9aa4ad29ef5885e340718c4a03c734f10063545fe9bb185d348a6ffbfb74220d34a4c3759cb17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deb-/usr/bin/dh-autoreconf \
dh-autoreconf"

RDEPENDS:${PN} += "/usr/bin/perl \
debhelper \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
