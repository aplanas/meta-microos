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

RPM_NAME = "perl-WeakRef-0.01-149.37.aarch64.rpm"
RPM_HASH = "4167a94090a65391293a10c80559cf79a748d2d2c9ae7affc66c3c0eb0383e5c4c2f9ccc84289f5f7569aa1e9aff2ce8d9c5ea8150f806007b67ee8f4d4204b0"

RPROVIDES:${PN} += "perl-WeakRef \
perl-Weakref"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
