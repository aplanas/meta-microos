SUMMARY = "Microsoft Azure Developer LoadTesting Client Library for Python"
DESCRIPTION = "Microsoft Azure Developer LoadTesting Client Library for Python"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-developer-loadtesting-1.0.0-1.4.noarch.rpm"
RPM_HASH = "da974493d377c9bc39fe764a75bb56baf37dac70f8c9442ba36a709104b74f74794f1758fb981db84161753b59a1e7358ad7d1294293a1473c703a29b0b78cde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-azure-developer-loadtesting \
python39-azure-developer-loadtesting \
python3dist-azure-developer-loadtesting"

RDEPENDS:${PN} += "python-abi \
python39-azure-core \
python39-azure-nspkg \
python39-isodate"

inherit rpm
