SUMMARY = "Remove files and directories"
DESCRIPTION = "*File::Remove::remove* removes files and directories. It acts like \
*/bin/rm*, for the most part. Although 'unlink' can be given a list of \
files, it will not remove directories; this module remedies that. It also \
accepts wildcards, * and ?, as arguments for filenames. \
 \
*File::Remove::trash* accepts the same arguments as *remove*, with the \
addition of an optional, infrequently used 'other platforms' hashref."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.61"

RPM_NAME = "perl-File-Remove-1.61-1.5.noarch.rpm"
RPM_HASH = "96532d4a02b7683589d0919eaeb5716e0f2ccd00d40cb4aaa4e88531ebd9e9646259c34d1e7185b42b9d58b901db82cd8f1c14995135f564e3c7cdd1a8d9a2ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Remove \
perl-File-Remove"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Cwd \
perl-File--Spec"

inherit rpm
