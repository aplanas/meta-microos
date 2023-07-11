SUMMARY = "Populate library namespace without incurring immediate import costs"
DESCRIPTION = "lazy_loader makes it easy to load subpackages and functions on demand. \
  1. Allow subpackages to be made visible to users without incurring import costs. \
  2. Allow external libraries to be imported only when used, improving import times."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "python311-lazy-loader-0.2-1.4.noarch.rpm"
RPM_HASH = "0163ea4655d75f9ebc398a941f4c1bdb418de8adb42932386b136c86d63ad821ea9cccb9abbd485467aae705f73d18debaee1093cbd90d28641ad0848a037cc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lazy-loader \
python3.11dist-lazy-loader \
python311-lazy-loader \
python3dist-lazy-loader"

RDEPENDS:${PN} += "python-abi"

inherit rpm
