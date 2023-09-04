SUMMARY = "Aspect-oriented programming"
DESCRIPTION = "Aspectlib is an aspect-oriented programming, monkey-patch and \
decorators library. It is useful when changing behavior in \
existing code is desired. It includes tools for debugging and \
testing: simple mock/record and a complete capture/replay \
framework."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python311-aspectlib-2.0.0-2.1.noarch.rpm"
RPM_HASH = "77a1457223fe64f7ac498a3ec0dd4aa0bf4f8667709f5b178d326f143af5c93ef460aca926bac8bebca7a03f704eefb4ff33618ba863c24315309c90fd183358"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aspectlib \
python3.11dist-aspectlib \
python311-aspectlib \
python3dist-aspectlib"

RDEPENDS:${PN} += "python-abi \
python311-fields"

inherit rpm
