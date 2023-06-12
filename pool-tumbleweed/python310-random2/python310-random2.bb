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

RPM_NAME = "python310-random2-1.0.1-8.1.noarch.rpm"
RPM_HASH = "a654488bbc7878ad401cd74bc4d4d32eca2cf75565e5dc3ea103a82cb5d5241d582da4695e19f5853f5fe8611c8cf6a5e6e8012f34bf03f6e1618b17a5c27e6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-random2 \
python3.10dist(random2) \
python310-random2 \
python3dist(random2)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
