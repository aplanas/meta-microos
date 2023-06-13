SUMMARY = "Simple DNS resolver for asyncio"
DESCRIPTION = "Simple DNS resolver for asyncio module."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python39-aiodns-3.0.0-2.1.noarch.rpm"
RPM_HASH = "b385228f0719a52268c16373ab51dfc9bc8d72993668313cb52c45ea47ec89227c7107417b81406c9eeaf694072d4947e938700cb562d47dde62cb446dcfd751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(aiodns) \
python39-aiodns \
python3dist(aiodns)"

RDEPENDS:${PN} += "python(abi) \
python39-pycares"

inherit rpm
