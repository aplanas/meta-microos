SUMMARY = "Perl implementation of the which utility as an API"
DESCRIPTION = "File::Which finds the full or relative paths to executable programs on the \
system. This is normally the function of 'which' utility. 'which' is \
typically implemented as either a program or a built in shell command. On \
some platforms, such as Microsoft Windows it is not provided as part of the \
core operating system. This module provides a consistent API to this \
functionality regardless of the underlying platform. \
 \
The focus of this module is correctness and portability. As a consequence \
platforms where the current directory is implicitly part of the search path \
such as Microsoft Windows will find executables in the current directory, \
whereas on platforms such as UNIX where this is not the case executables in \
the current directory will only be found if the current directory is \
explicitly added to the path. \
 \
If you need a portable 'which' on the command line in an environment that \
does not provide it, install App::pwhich which provides a command line \
interface to this API."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.27"

RPM_NAME = "perl-File-Which-1.27-1.11.noarch.rpm"
RPM_HASH = "46b1d12f78aa74673442ad04ffeee7251e831a94a24c40b9dcbe774b9ee05d0f5e4803f1b94ea7a70bc0f05177797e776f4d65e7df6abc84da19e4535368f967"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Which \
perl-File-Which"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
