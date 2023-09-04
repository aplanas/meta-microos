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

RPM_NAME = "dh-autoreconf-19-3.12.noarch.rpm"
RPM_HASH = "b11c0d0a25e51d699b0de04ccdae1f392e46804f5cdebc27a5da771bf75b5c4e683568432a81c70bbe439e6529e285ecc3bfd3c49ba8226828d3804efd40630f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deb-/usr/bin/dh-autoreconf \
dh-autoreconf"

RDEPENDS:${PN} += "/usr/bin/perl \
debhelper \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
