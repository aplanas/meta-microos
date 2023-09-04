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

RPM_NAME = "perl-File-Share-0.27-1.4.noarch.rpm"
RPM_HASH = "95f7b2b8a1e9bdab59bc57420e5d92400de3cdfa0c01791025611702f063351ea0732abb56834af66deaa318565c172c8626055fb83820779a5f3aaf9dc863e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Share \
perl-File-Share"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-File--ShareDir \
perl-Readonly"

inherit rpm
