SUMMARY = "Populate library namespace without incurring immediate import costs"
DESCRIPTION = "lazy_loader makes it easy to load subpackages and functions on demand. \
  1. Allow subpackages to be made visible to users without incurring import costs. \
  2. Allow external libraries to be imported only when used, improving import times."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "python39-lazy-loader-0.2-1.2.noarch.rpm"
RPM_HASH = "0d2c0146029dfa2e3d213c7d8122a89c716605970fd0abe46fe868ea36861e1be5002ade2d68447eabc8fad6977041d5cf76d31bb8464d9a6edef35e6375d380"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(lazy-loader) \
python39-lazy-loader \
python39-lazy_loader \
python3dist(lazy-loader)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
