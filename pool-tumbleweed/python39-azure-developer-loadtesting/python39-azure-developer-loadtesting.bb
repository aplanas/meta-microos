SUMMARY = "Microsoft Azure Developer LoadTesting Client Library for Python"
DESCRIPTION = "Microsoft Azure Developer LoadTesting Client Library for Python"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-developer-loadtesting-1.0.0-1.2.noarch.rpm"
RPM_HASH = "b447356e18f19bdce402be626e0f4d6191547cae04ee65ff03ea0390399681fe9e5adce9d81b79c403a9ec29719a98070bba3df42b358fb42b978163568dcfe2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-developer-loadtesting) \
python39-azure-developer-loadtesting \
python3dist(azure-developer-loadtesting)"

RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-core \
python39-azure-nspkg \
python39-isodate"

inherit rpm
