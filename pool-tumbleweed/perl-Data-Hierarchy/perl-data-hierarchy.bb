SUMMARY = "Handle data in a hierarchical structure"
DESCRIPTION = "the Data::Hierarchy manpage provides a simple interface for manipulating \
inheritable data attached to a hierarchical environment (like a \
filesystem). \
 \
One use of the Data::Hierarchy manpage is to allow an application to \
annotate paths in a real filesystem in a single compact data structure. \
However, the hierarchy does not actually need to correspond to an actual \
filesystem. \
 \
Paths in a hierarchy are referred to in a Unix-like syntax; ''/'' is the \
root 'directory'. (You can specify a different separator character than the \
slash when you construct a Data::Hierarchy object.) With the exception of \
the root path, paths should never contain trailing slashes. You can \
associate properties, which are arbitrary name/value pairs, with any path. \
(Properties cannot contain the undefined value.) By default, properties are \
inherited by child paths: thus, if you store some data at '/some/path': \
 \
    $tree->store('/some/path', {color => 'red'}); \
 \
you can fetch it again at a '/some/path/below/that': \
 \
    print $tree->get('/some/path/below/that')->{'color'}; \
     \
 \
On the other hand, properties whose names begin with dots are uninherited, \
or 'sticky': \
 \
    $tree->store('/some/path', {'.color' => 'blue'}); \
    print $tree->get('/some/path')->{'.color'};            # prints blue \
    print $tree->get('/some/path/below/that')->{'.color'}; # undefined \
 \
Note that you do not need to (and in fact, cannot) explicitly add 'files' \
or 'directories' to the hierarchy; you simply add and delete properties to \
paths."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.34"

RPM_NAME = "perl-Data-Hierarchy-0.34-131.28.noarch.rpm"
RPM_HASH = "bd85d1c9bdb8b3bd4f64caa8323a7d815ea927cb224d3bc68e5d8783e5eb4be760f1c6371caf8272a0d125ec3c2e592f48723356c7b637e48a40b48cc68305a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Hierarchy \
perl-Data--Hierarchy--Relative \
perl-Data-Hierarchy"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Test--Exception"

inherit rpm
