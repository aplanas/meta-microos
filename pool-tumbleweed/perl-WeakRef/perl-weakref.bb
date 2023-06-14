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

RPM_NAME = "perl-WeakRef-0.01-149.36.aarch64.rpm"
RPM_HASH = "3128b60f624abff61165b1645a539c173376752cfa38a9568389df9464a1765bd767558512f46621da0fd63e2844b0780392d066ebaab2009934bbf7e6acb7be"

RPROVIDES:${PN} += "perl-WeakRef \
perl-Weakref"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
