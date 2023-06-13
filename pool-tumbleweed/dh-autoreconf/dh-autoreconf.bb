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

RPM_NAME = "dh-autoreconf-19-3.10.noarch.rpm"
RPM_HASH = "f6bfed3a91061442609751ef8710b0f01415e448206d83b7d2781b35fc7c3b5f3f4ca090d92226618d279e13af7cf21082b6ae43b6f4bbede2442081d16b9cb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deb:/usr/bin/dh_autoreconf \
dh-autoreconf"

RDEPENDS:${PN} += "/usr/bin/perl \
debhelper \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
