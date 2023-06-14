SUMMARY = "Additional utils for Perl symbols manipulation"
DESCRIPTION = "This module provides a set of additional functions useful for Perl symbols \
manipulation. \
 \
All Perl symbols from the same package are organized as a stash. Each \
symbol (glob) contains one or more of following slots: 'SCALAR', 'ARRAY', \
'HASH', 'CODE', 'IO', 'FORMAT'. These slots are also accessible as standard \
variables or bare words. \
 \
The Perl symbols table is directly accessible with typeglob prefix but it \
can be difficult to read and problematic if strict mode is used. Also the \
access to stash, glob and one of its slot have different syntax notation. \
 \
'stash' and 'fetch_glob' functions gets stash or glob without need to use \
'no strict 'refs''. \
 \
'delete_glob' function allows to delete specific slot of symbol name \
without deleting others. \
 \
'delete_sub' removes the symbol from class API. This symbol won't be \
available as an object method. \
 \
'export_glob' function exports a glob to the target package. \
 \
'export_package' works like the Exporter manpage module and allows to \
export symbols from one package to other. \
 \
'unexport_package' allows to delete previously exported symbols."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.0203"

RPM_NAME = "perl-Symbol-Util-0.0203-5.24.noarch.rpm"
RPM_HASH = "05ba82ccf72bf368feeab6fa630a831995de24683891fccca42175cf1f8fa1abad6716b4d99913db807fa2dc74100d182838e4bf15b1ce3594440aa8fb0ab729"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Symbol--Util \
perl-Symbol-Util"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
