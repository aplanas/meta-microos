SUMMARY = "C++ headers for C extension development"
DESCRIPTION = "C++ headers for C extension development"
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python39-cppy-1.2.1-2.1.noarch.rpm"
RPM_HASH = "900c0e3e18ce2065a76fb349f8733f4cd2973a4c01b48eee1f7e98ffb88508b0cd0ec145b03b48065cebfed273f4e645fc6d56f36924d0678620e9487e0af6c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cppy \
python39-cppy \
python3dist-cppy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
