SUMMARY = "A collection of Python deprecation patterns and strategies"
DESCRIPTION = "A collection of Python deprecation patterns and strategies that help \
you collect your technical debt in a non-destructive manner. The goal \
of this library is to provide well documented developer facing \
deprecation patterns that start of with a basic set and can expand \
into a larger set of patterns as time goes on. The desired output of \
these patterns is to apply the warnings module to emit \
DeprecationWarning or PendingDeprecationWarning or similar derivative \
to developers using libraries (or potentially applications) about \
future deprecations. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "python3-debtcollector-2.5.0-1.4.noarch.rpm"
RPM_HASH = "b1ea150479eaf38ac022c1065cbed1604856d44d3aa769d9a769ba26f4a9b71d333c96d010f29cd3654e24e5bc28e40519007129f7501007f313d4dce03569d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-debtcollector \
python3.10dist(debtcollector) \
python3dist(debtcollector)"

RDEPENDS:${PN} += "python(abi) \
python3-importlib-metadata \
python3-pbr \
python3-six \
python3-wrapt"

inherit rpm
