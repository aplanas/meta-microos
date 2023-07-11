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

RPM_NAME = "python39-lazy-1.5-2.2.noarch.rpm"
RPM_HASH = "33326436036d4787336b8861188cba48bfa4337dac41e6595867c68267ba838d11375cab4a8749ccd12baf5ac1400e036d0190bc76b4dbad3d22c82f1ef1caed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-lazy \
python39-lazy \
python3dist-lazy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
