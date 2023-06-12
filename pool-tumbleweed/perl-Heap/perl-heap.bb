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

RPM_NAME = "perl-Heap-0.80-1.12.noarch.rpm"
RPM_HASH = "1401146596a0f4ad334ebd39daf6ec3c1a71cc1a75649c10503460b088d17c41b77f78d41223fe2d3042d03d5642bbe5c5d514c48b6a9af8e6153f66e70c9b18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Heap) \
perl(Heap::Binary) \
perl(Heap::Binomial) \
perl(Heap::Elem) \
perl(Heap::Elem::Num) \
perl(Heap::Elem::NumRev) \
perl(Heap::Elem::Ref) \
perl(Heap::Elem::RefRev) \
perl(Heap::Elem::Str) \
perl(Heap::Elem::StrRev) \
perl(Heap::Fibonacci) \
perl-Heap"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
