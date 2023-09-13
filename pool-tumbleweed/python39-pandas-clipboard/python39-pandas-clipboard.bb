SUMMARY = "The python pandas[clipboard] extra"
DESCRIPTION = "This package provides the [clipboard] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-pandas-clipboard-2.1.0-1.2.noarch.rpm"
RPM_HASH = "3228fbfa027bf8b92661be71f7d9864fc0587e78d18c4ace4011949805710430acdc3c12cb603d521b5e21f999c218cc135f9dc0aa0870798f497f955e07714e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-clipboard"

RDEPENDS:${PN} += "python39-PyQt5 \
python39-QtPy \
python39-pandas"

inherit rpm
