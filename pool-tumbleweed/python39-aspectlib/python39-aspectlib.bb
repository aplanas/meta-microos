SUMMARY = "Aspect-oriented programming"
DESCRIPTION = "Aspectlib is an aspect-oriented programming, monkey-patch and \
decorators library. It is useful when changing behavior in \
existing code is desired. It includes tools for debugging and \
testing: simple mock/record and a complete capture/replay \
framework."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python39-aspectlib-2.0.0-1.1.noarch.rpm"
RPM_HASH = "5ba73c0a6d2dc47f3a00a9ba432d3ca76c552a0506cc6fa33741146ac67c2cdac02c25eb05e7f1225ecd54ec025214141dfedb4e99a83ba15b6bef65f347929f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(aspectlib) \
python39-aspectlib \
python3dist(aspectlib)"

RDEPENDS:${PN} += "python(abi) \
python39-fields"

inherit rpm
