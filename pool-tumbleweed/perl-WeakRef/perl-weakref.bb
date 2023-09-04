SUMMARY = "API for weak references to be created in Perl"
DESCRIPTION = "A patch to Perl 5.005_55 by the author implements a core API for weak \
references. This module is a Perl-level interface to that API, allowing \
weak references to be created in Perl. \
 \
A weak reference is just like an ordinary Perl reference except that it \
isn't included in the reference count of the thing referred to. This \
means that once all references to a particular piece of data are weak, \
the piece of data is freed and all the weak references are set to \
undef. This is particularly useful for implementing circular data \
structures without memory leaks or caches of objects. \
 \
 \
 \
Authors: \
-------- \
    Tuomas J. Lukka      <lukka@iki.fi>"
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "0.01"

RPM_NAME = "perl-WeakRef-0.01-149.38.aarch64.rpm"
RPM_HASH = "2ba344104eca24ebc913dfa24f8c35af69678cef81516a3bcd566fa12e794a1eb7fb4506a2f09d13ffca34cde531e3144dd69360d114d38c8093989ed5f26d82"

RPROVIDES:${PN} += "perl-WeakRef \
perl-Weakref"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
