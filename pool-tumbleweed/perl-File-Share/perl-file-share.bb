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

RPM_NAME = "perl-File-Share-0.27-1.3.noarch.rpm"
RPM_HASH = "bbcc256c1d2e9f15e67071d322220a181cff96bc3bbc6ea3182f9a232640eaae4052ce598fb4e0d43e015720e330f312ef89a45e682d7792e310c23e2e4b30ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Share \
perl-File-Share"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-File--ShareDir \
perl-Readonly"

inherit rpm
