SUMMARY = "Extend File::ShareDir to Local Libraries"
DESCRIPTION = "This module is a dropin replacement for File::ShareDir. It supports the \
'dist_dir' and 'dist_file' functions, except these functions have been \
enhanced to understand when the developer's local './share/' directory \
should be used. \
 \
NOTE: module_dist and module_file are not yet supported, because (afaik) \
there is no well known way to populate per-module share files. This may \
change in the future. Please contact me if you know how to do this."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.27"

RPM_NAME = "perl-File-Share-0.27-1.2.noarch.rpm"
RPM_HASH = "0f5a336ec7cba1910b4e8e615c2315075bf7bafe6a9b32afd06c2394404c40b28eb0978a47b6d51991f7bf44472c4f388601eef40ad73c52e2c16e90625b5b43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(File::Share) \
perl-File-Share"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(File::ShareDir) \
perl(Readonly)"

inherit rpm
