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

RPM_NAME = "python310-random2-1.0.1-8.3.noarch.rpm"
RPM_HASH = "b03082a395a7a43766ebea6531fce9f0ff44a966768f68709edb97ea294c7893ecfd766b16d8fa79fb6aa77549ba72b29aa368371a18789d6b269672989d2b93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-random2 \
python310-random2 \
python3dist-random2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
