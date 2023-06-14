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

RPM_NAME = "python39-random2-1.0.1-8.1.noarch.rpm"
RPM_HASH = "919c060c7ec9a42e46308167647276bfd3cfb1be0d0b64e5b4344d700ba5d01e52a91f3913be5e94d456e2794edd8034a0dd876dc6ce2487bc1b4ee316356c0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-random2 \
python39-random2 \
python3dist-random2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
