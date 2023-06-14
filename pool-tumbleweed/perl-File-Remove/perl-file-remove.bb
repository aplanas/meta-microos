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

RPM_NAME = "perl-File-Remove-1.61-1.4.noarch.rpm"
RPM_HASH = "829464dadefde1358667dc6e4f0dcf563ad8af2d86d25e9160f7ca11c9897f44b8ba4d353d46f1e9f4f6b00d24177f38662c74e9214875175753094c06d2948d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Remove \
perl-File-Remove"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Cwd \
perl-File--Spec"

inherit rpm
