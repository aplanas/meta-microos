SUMMARY = "Lazy attributes for Python objects"
DESCRIPTION = "Lazy attributes are computed attributes that are evaluated only once, \
the first time they are used. Subsequent uses return the results of \
the first call. They come handy when code should run \
 * late, i.e. just before it is needed, and \
 * once, i.e. not twice, in the lifetime of an object. \
You can think of it as deferred initialization. The possibilities are \
endless."
LICENSE = "BSD-2-Clause"

PV = "1.5"

RPM_NAME = "python311-lazy-1.5-2.2.noarch.rpm"
RPM_HASH = "4af3c6ed0664da0a65737f3aca15b340299e5f699db3e9698982c80492d9e9f88ff3dcb3cbeaf7e44eab59cedcacda8984c4431f7ab3dfe179d785b1eeb4a8fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lazy \
python3.11dist-lazy \
python311-lazy \
python3dist-lazy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
