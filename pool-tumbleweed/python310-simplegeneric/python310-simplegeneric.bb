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

RPM_NAME = "python310-simplegeneric-0.8.1-9.19.noarch.rpm"
RPM_HASH = "cac96ed95b1bc3fb01b824e4be009ded990ecd849749d005c6c2ab6d27551ae9c5e405df90caeca1d92f9e8fc5db282d4334c36a3482eb43e5e752fd2c9ab3f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-simplegeneric \
python310-simplegeneric \
python3dist-simplegeneric"

RDEPENDS:${PN} += "python-abi"

inherit rpm
