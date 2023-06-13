SUMMARY = "Python module for retrying code until it succeeeds"
DESCRIPTION = "Tenacity is a general-purpose retrying library, written in Python, to simplify \
the task of adding retry behavior to just about anything. \
It originates from a fork of `Retrying`_ \
Features \
-------- \
- Generic Decorator API \
- Specify stop condition (i.e. limit by number of attempts) \
- Specify wait condition (i.e. exponential backoff sleeping between attempts) \
- Customize retrying on Exceptions \
- Customize retrying on expected returned result"
LICENSE = "Apache-2.0"

PV = "8.2.2"

RPM_NAME = "python311-tenacity-8.2.2-1.1.noarch.rpm"
RPM_HASH = "86f6584a591ddc504402a6770428d3c4eb89e16e3d666011b7f0d9b2a85101d17f757b7673522b8c33daac3c5cf4ce8709d9c76882098cf48dbc2d35f86426f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tenacity) \
python311-tenacity \
python3dist(tenacity)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
