SUMMARY = "Perl extensions for keeping data partially sorted"
DESCRIPTION = "The Heap collection of modules provide routines that manage a heap of \
elements. A heap is a partially sorted structure that is always able to \
easily extract the smallest of the elements in the structure (or the \
largest if a reversed compare routine is provided). \
 \
If the collection of elements is changing dynamically, the heap has less \
overhead than keeping the collection fully sorted. \
 \
The elements must be objects as described in 'Heap::Elem' and all elements \
inserted into one heap must be mutually compatible - either the same class \
exactly or else classes that differ only in ways unrelated to the \
*Heap::Elem* interface."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.80"

RPM_NAME = "perl-Heap-0.80-1.13.noarch.rpm"
RPM_HASH = "04b0471c0be9204b1f58eb93336e8fa2150a99d96a5fbe960edbc14dd978d02cf151c25fbdef0422b5f37cfd3ab3a270677f4a91f2fb91e7d04510c2f41b1a66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Heap \
perl-Heap--Binary \
perl-Heap--Binomial \
perl-Heap--Elem \
perl-Heap--Elem--Num \
perl-Heap--Elem--NumRev \
perl-Heap--Elem--Ref \
perl-Heap--Elem--RefRev \
perl-Heap--Elem--Str \
perl-Heap--Elem--StrRev \
perl-Heap--Fibonacci"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
