SUMMARY = "Python module that identifies Chinese text as Simplified or Traditional"
DESCRIPTION = "Python module that identifies Chinese text as Simplified or Traditional."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-hanzidentifier-1.1.0-2.1.noarch.rpm"
RPM_HASH = "d7e12def2256e0927a2e8dc608c4317dc0aef9c7640208a1bf1e7455fb2930ce68ac6d9b50e4a599feae417e1bf2f0353bf652c6c9155f4abd085900056635ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(hanzidentifier) \
python39-hanzidentifier \
python3dist(hanzidentifier)"

RDEPENDS:${PN} += "python(abi) \
python39-zhon"

inherit rpm
