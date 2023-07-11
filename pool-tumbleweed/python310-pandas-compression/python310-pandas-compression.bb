SUMMARY = "The python pandas[compression] extra"
DESCRIPTION = "This package provides the [compression] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python310-pandas-compression-2.0.2-4.1.noarch.rpm"
RPM_HASH = "cb037a5f620bb0fa89ad3c04f46e763df8dd9b78d7667d7d23ecffe05e830f4cba44726a2677dfda87abcb5dfab557b12e9b7a0adacf39e9eb83b1ccb390794e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-compression"

RDEPENDS:${PN} += "python310-brotlipy \
python310-pandas \
python310-python-snappy \
python310-zstandard"

inherit rpm
