SUMMARY = "Module to sniff which async library code runs under"
DESCRIPTION = "This is a package for detecting which async library code is running \
under. It supports multiple async I/O packages, like Trio, and \
asyncio."
LICENSE = "Apache-2.0 | MIT"

PV = "1.3.0"

RPM_NAME = "python39-sniffio-1.3.0-2.1.noarch.rpm"
RPM_HASH = "8f2334746d9011f583e9f5bf3fe5b998cb9b32e261b14f38d0b2e97e71d0f1ac8460ecfa04e23ccff38370f847e42084cddd4d9acf99542339a5412cb9bd428e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sniffio) \
python39-sniffio \
python3dist(sniffio)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
