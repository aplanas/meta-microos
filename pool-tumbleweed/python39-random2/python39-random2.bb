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

RPM_NAME = "python39-random2-1.0.1-8.3.noarch.rpm"
RPM_HASH = "e84787ff1837d139dbadbfd60f18b9d54369c063178fab960a71a9bc07bba49d4495b98690865d25fc0ed57ce0392347271a29385e2442abfb9cc1e3bfbcbe1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-random2 \
python39-random2 \
python3dist-random2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
