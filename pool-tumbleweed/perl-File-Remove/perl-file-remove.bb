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

RPM_NAME = "perl-File-Remove-1.61-1.6.noarch.rpm"
RPM_HASH = "dc1c7c1efc4c106fd873da723f8474afb6b3a8affee63a90d42fccf99fb74608914b7dc636785271b57708b8578e625ea1a06c073e65a9b173bf6691129cbf39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Remove \
perl-File-Remove"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Cwd \
perl-File--Spec"

inherit rpm
