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

RPM_NAME = "python310-tenacity-8.2.2-1.1.noarch.rpm"
RPM_HASH = "1ce669318efd5069582857baacda8c962f01cb270cb72b44c3bb5852c5becae82d9fffd711a540779ef40ea43099cb8a3baadd76aead7e9e6aef3490bf6fde9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tenacity \
python3.10dist(tenacity) \
python310-tenacity \
python3dist(tenacity)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
