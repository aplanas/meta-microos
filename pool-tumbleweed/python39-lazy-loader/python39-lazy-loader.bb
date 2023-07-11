SUMMARY = "Populate library namespace without incurring immediate import costs"
DESCRIPTION = "lazy_loader makes it easy to load subpackages and functions on demand. \
  1. Allow subpackages to be made visible to users without incurring import costs. \
  2. Allow external libraries to be imported only when used, improving import times."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "python39-lazy-loader-0.2-1.4.noarch.rpm"
RPM_HASH = "7e670c121363ae47ee0aafa6274fb1170ac5145047a70ce80b4294a393fc726cda42b8956acab1b9bd17d2a9310b4c2f9d11eeecb1bd11b4eec9dc24552b4d0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-lazy-loader \
python39-lazy-loader \
python3dist-lazy-loader"

RDEPENDS:${PN} += "python-abi"

inherit rpm
