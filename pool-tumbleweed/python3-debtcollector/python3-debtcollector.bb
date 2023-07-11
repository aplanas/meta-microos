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

RPM_NAME = "python3-debtcollector-2.5.0-1.5.noarch.rpm"
RPM_HASH = "17c6d3ca267873d05824a2bfe8adb59754369fcb914ae679684e7ce30f166c288515900db53b5a9e881f09e996b48e019d8edb27d95e6e7568319b88524676cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-debtcollector \
python3.11dist-debtcollector \
python3dist-debtcollector"

RDEPENDS:${PN} += "python-abi \
python3-importlib-metadata \
python3-pbr \
python3-six \
python3-wrapt"

inherit rpm
