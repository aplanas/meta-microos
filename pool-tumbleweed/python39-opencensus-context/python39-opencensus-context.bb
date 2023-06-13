SUMMARY = "Python in-process context propogation"
DESCRIPTION = "The OpenCensus Runtime Context provides in-process context propagation. \
By default, thread local storage is used for Python 2.7, 3.4 and 3.5; \
contextvars is used for Python >= 3.6, which provides asyncio support."
LICENSE = "Apache-2.0"

PV = "0.1.3"

RPM_NAME = "python39-opencensus-context-0.1.3-1.3.noarch.rpm"
RPM_HASH = "968cd93faad04d18584a20d65fc5f108ce996d88511285300ba4388a53809d1cb0e0429e272b502ff104c02e9fcda9b9ca493b71b9e7cfad547dfb98972be7b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(opencensus-context) \
python39-opencensus-context \
python3dist(opencensus-context)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
