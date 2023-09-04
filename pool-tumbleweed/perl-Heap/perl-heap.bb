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

RPM_NAME = "perl-Heap-0.80-1.14.noarch.rpm"
RPM_HASH = "ed6760531a46afea1e2ec3b12d49c802e4ecb75f2ff2daa5eaa5b95f13e08eba9821a81f88ffc57ab557877759ba5ac62e61778a6df7e387a7d1fa67781de670"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
