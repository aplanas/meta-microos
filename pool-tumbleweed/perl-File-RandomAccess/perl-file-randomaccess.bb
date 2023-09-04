SUMMARY = "Random access reads of sequential file or scalar"
DESCRIPTION = "Allows random access to sequential file by buffering the file if \
necessary. Also allows access to data in memory to be accessed as \
if it were a file."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "12.65"

RPM_NAME = "perl-File-RandomAccess-12.65-1.1.noarch.rpm"
RPM_HASH = "274de709a5d9c34425ce3eded7b6a73912c9da6b0e8cd8acae996c7b88a728cd54512898abd0860ab7e7a0513caf77b546beade6106e63d75a0e2774dcedbc91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--RandomAccess \
perl-File-RandomAccess"

RDEPENDS:${PN} += ""

inherit rpm
