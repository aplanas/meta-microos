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

RPM_NAME = "python39-tenacity-8.2.2-1.3.noarch.rpm"
RPM_HASH = "10dc4c17a75cf2ce6b3755926318469e8a393000165d2b3694090910c5966b533d6c882dd8b55148681c2b27fb6bdcc277dae652c208ad10d4fe70c6aaeb277a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tenacity \
python39-tenacity \
python3dist-tenacity"

RDEPENDS:${PN} += "python-abi"

inherit rpm
