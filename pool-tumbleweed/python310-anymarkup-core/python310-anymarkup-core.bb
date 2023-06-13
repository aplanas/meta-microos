SUMMARY = "Core library for anymarkup"
DESCRIPTION = "This is the core library that implements functionality of \
python-anymarkup."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python310-anymarkup-core-0.8.1-3.3.noarch.rpm"
RPM_HASH = "a7251410fadd9ff89d651baa05652632281ef1af7dcbf53f17e23da6cb7f7ad997a70a3eeef5d2aade0e561d7e821cc86d335e59f9a7a8adcffd4287f83b3e66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-anymarkup-core \
python3.10dist(anymarkup-core) \
python310-anymarkup-core \
python3dist(anymarkup-core)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
