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

RPM_NAME = "python310-lazy-1.5-1.3.noarch.rpm"
RPM_HASH = "8f4669c4a170a47156eef6920df387660ba4c7786733866fdd93124464fb653ae3b8ca616246abb44187857eada61ea82e9a2394b851c5faab06041379e3ddd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lazy \
python3.10dist(lazy) \
python310-lazy \
python3dist(lazy)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
