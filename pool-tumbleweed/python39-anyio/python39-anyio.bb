SUMMARY = "High level compatibility layer for asynchronous event loop implementations"
DESCRIPTION = "Asynchronous compatibility API that allows applications and libraries written \
against it to run unmodified on asyncio, curio and trio."
LICENSE = "MIT"

PV = "3.6.2"

RPM_NAME = "python39-anyio-3.6.2-5.1.noarch.rpm"
RPM_HASH = "595157f2b955af46de61c1edb32fc65880e87b8ca489e17c3334b8cd2840458f453c8bb0605dfd9360211fed678a02049785046e17210eaef4696659c9a2f19b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(anyio) \
python39-anyio \
python3dist(anyio)"
RDEPENDS:${PN} += "python(abi) \
python39-idna \
python39-sniffio"

inherit rpm
