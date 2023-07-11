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

RPM_NAME = "python310-lazy-1.5-2.2.noarch.rpm"
RPM_HASH = "fd5e7f5fc6ad5df5922cde26d9b389c0fd4754fb53b587843503824151fb1281a7eb5d9157659dacfa669971a1db856d4f9a9b27817d573ea8889d6692863d21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-lazy \
python310-lazy \
python3dist-lazy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
