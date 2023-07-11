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

RPM_NAME = "python311-random2-1.0.1-8.3.noarch.rpm"
RPM_HASH = "c9e1457e6dc768b3f98b04b760ae542127ed5541821c6e50aae2b7e75074002906a7740d6a63ae86e1bf422183824bce8e927a76758164fa24d1ea7c4a7fc905"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-random2 \
python3.11dist-random2 \
python311-random2 \
python3dist-random2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
