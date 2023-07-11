SUMMARY = "Random access reads of sequential file or scalar"
DESCRIPTION = "Allows random access to sequential file by buffering the file if \
necessary. Also allows access to data in memory to be accessed as \
if it were a file."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "12.64"

RPM_NAME = "perl-File-RandomAccess-12.64-1.1.noarch.rpm"
RPM_HASH = "a1467d5aae5966f60a8bd100fb23812f4e6c01526dea7a8465df8b9567945c73406c8548fa595a040e10d4aca4320f51778b7f8d3795d108493c1744a9e323b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--RandomAccess \
perl-File-RandomAccess"

RDEPENDS:${PN} += ""

inherit rpm
