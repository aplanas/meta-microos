SUMMARY = "A Session and Caching library with WSGI Middleware"
DESCRIPTION = "This package provides a Python 3 ported version of Python 2.7's random module. \
It has also been back-ported to work in Python 2.6. \
 \
In Python 3, the implementation of randrange() was changed, so that even with \
the same seed you get different sequences in Python 2 and 3. Note that several \
high-level functions such as randint() and choice() use randrange(). \
 \
In my testing code I heavily rely on stable random generator results and it \
makes porting code to Python 3 a lot harder, if all those tests have to be \
adjusted. This package fixes that."
LICENSE = "Python-2.0"

PV = "1.0.1"

RPM_NAME = "python311-random2-1.0.1-8.1.noarch.rpm"
RPM_HASH = "dcfc9dcc0a905bf449aa2b24eb7095f2e552c7ca4cc497b6212c3ed4c9cace0bcaab697835b91ce8f8dcc1add677d753da146844b994a4424cc650e432dd1f92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-random2 \
python311-random2 \
python3dist-random2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
