SUMMARY = "Populate library namespace without incurring immediate import costs"
DESCRIPTION = "lazy_loader makes it easy to load subpackages and functions on demand. \
  1. Allow subpackages to be made visible to users without incurring import costs. \
  2. Allow external libraries to be imported only when used, improving import times."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "python310-lazy-loader-0.2-1.4.noarch.rpm"
RPM_HASH = "50dee29325bca49c92678708ced3691e72c938faeaf1aa0212a86e765fe6f25b1ff06adc4166b98dddb674bf824aee2f1a3a737db2a150a987a45253bcf01567"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-lazy-loader \
python310-lazy-loader \
python3dist-lazy-loader"

RDEPENDS:${PN} += "python-abi"

inherit rpm
