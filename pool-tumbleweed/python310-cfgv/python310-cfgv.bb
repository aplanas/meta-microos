SUMMARY = "Configuration validator producing human readable error messages"
DESCRIPTION = "A configuration validator for Python that produce human readable error messages."
LICENSE = "MIT"

PV = "3.3.1"

RPM_NAME = "python310-cfgv-3.3.1-1.6.noarch.rpm"
RPM_HASH = "271612c6b4031fb52d2b4c753e0efbda3a7b59dc7b35d6b03e8049969a526126a84ec576449dc9b0cce0ce8837e8b2c557498c6a7821072a2b28b5bddfe97369"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cfgv \
python3.10dist-cfgv \
python310-cfgv \
python3dist-cfgv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
