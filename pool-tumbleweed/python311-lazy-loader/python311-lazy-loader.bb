SUMMARY = "Populate library namespace without incurring immediate import costs"
DESCRIPTION = "lazy_loader makes it easy to load subpackages and functions on demand. \
  1. Allow subpackages to be made visible to users without incurring import costs. \
  2. Allow external libraries to be imported only when used, improving import times."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "python311-lazy-loader-0.2-1.2.noarch.rpm"
RPM_HASH = "c3b4f52320d145d809812bff01f6eb32b23ffe8b6eef1054c2517d5f8874934d65182695e2e7be5a88be4ea4006e4fb5fcc8ce78b0ad30dcc7520dc116c44d8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-lazy-loader \
python311-lazy-loader \
python3dist-lazy-loader"

RDEPENDS:${PN} += "python-abi"

inherit rpm
