SUMMARY = "Simple generic functions (similar to Python's own len(), pickle.dump(), etc)"
DESCRIPTION = "The gsimplegeneric module lets you define simple single-dispatch \
generic functions, akin to Python's built-in generic functions like \
glen(), iter() and so on.  However, instead of using \
specially-named methods, these generic functions use simple lookup \
tables, akin to those used by e.g. gpickle.dump() and other \
generic functions found in the Python standard library. \
 \
As you can see from the above examples, generic functions are actually \
quite common in Python already, but there is no standard way to create \
simple ones.  This library attempts to fill that gap, as generic \
functions are an gexcellent alternative to the Visitor pattern_, as \
well as being a great substitute for most common uses of adaptation. \
 \
This library tries to be the simplest possible implementation of generic \
functions, and it therefore eschews the use of multiple or predicate \
dispatch, as well as avoiding speedup techniques such as C dispatching \
or code generation.  But it has absolutely no dependencies, other than \
Python 2.4, and the implementation is just a single Python module of \
less than 100 lines."
LICENSE = "ZPL-2.1"

PV = "0.8.1"

RPM_NAME = "python39-simplegeneric-0.8.1-9.17.noarch.rpm"
RPM_HASH = "044d628e07aaaaf989aa02a3a455743917fd845cc5b55f2748778ad6b25f8af3c8dcb03542346c7a0138d8fbe242d6055f10a0c42217f443201d192689c9a2fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-simplegeneric \
python39-simplegeneric \
python3dist-simplegeneric"

RDEPENDS:${PN} += "python-abi"

inherit rpm
