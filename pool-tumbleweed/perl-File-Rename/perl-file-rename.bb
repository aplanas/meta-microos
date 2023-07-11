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

RPM_NAME = "perl-File-Rename-1.31-1.7.noarch.rpm"
RPM_HASH = "c1b74bab3956ad2cbb5bbf6f5b37861ce43d9cc7d3c077abe7b0895d776bb371071549690f18bee04e8348326265e3fd29e405bbdb36ccaa5acd903b6eb5283c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Rename \
perl-File--Rename--Options \
perl-File--Rename--Unicode \
perl-File-Rename"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
