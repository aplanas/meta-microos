SUMMARY = "Perl extension for renaming multiple files"
DESCRIPTION = "* 'rename( FILES, CODE [, VERBOSE])' \
 \
rename FILES using CODE, if FILES is empty read list of files from stdin \
 \
* 'rename_files( CODE, VERBOSE, FILES)' \
 \
rename FILES using CODE \
 \
* 'rename_list( CODE, VERBOSE, HANDLE [, FILENAME])' \
 \
rename a list of file read from HANDLE, using CODE"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.31"

RPM_NAME = "perl-File-Rename-1.31-1.6.noarch.rpm"
RPM_HASH = "e71198b5389d45b70f59af637dcfe2e2de62396c092ac4fc5c97452ce6733cf861d98226a8ac1ee1603e04f03dcb36207014a7828ca570be236dc70d7855f45c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(File::Rename) \
perl(File::Rename::Options) \
perl(File::Rename::Unicode) \
perl-File-Rename"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
