SUMMARY = "Return name and handle of a temporary file safely"
DESCRIPTION = "'File::Temp' can be used to create and open temporary files in a safe way. \
There is both a function interface and an object-oriented interface. The \
File::Temp constructor or the tempfile() function can be used to return the \
name and the open filehandle of a temporary file. The tempdir() function \
can be used to create a temporary directory. \
 \
The security aspect of temporary file creation is emphasized such that a \
filehandle and filename are returned together. This helps guarantee that a \
race condition can not occur where the temporary file is created by another \
process between checking for the existence of the file and its opening. \
Additional security levels are provided to check, for example, that the \
sticky bit is set on world writable directories. See 'safe_level' for more \
information. \
 \
For compatibility with popular C library functions, Perl implementations of \
the mkstemp() family of functions are provided. These are, mkstemp(), \
mkstemps(), mkdtemp() and mktemp(). \
 \
Additionally, implementations of the standard POSIX tmpnam() and tmpfile() \
functions are provided if required. \
 \
Implementations of mktemp(), tmpnam(), and tempnam() are provided, but \
should be used with caution since they return only a filename that was \
valid when function was called, so cannot guarantee that the file will not \
exist by the time the caller opens the filename. \
 \
Filehandles returned by these functions support the seekable methods."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.2311"

RPM_NAME = "perl-File-Temp-0.2311-1.14.noarch.rpm"
RPM_HASH = "8eec7a0ce8b01023204fef9081aa9913741931cf5bfc7a079b89d6f554b3b1bd2238c6cfb18296a250bec8d8260884252cc270e629dd7c19e039ebc0eb87aae0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Temp \
perl-File-Temp"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-File--Path \
perl-parent"

inherit rpm
