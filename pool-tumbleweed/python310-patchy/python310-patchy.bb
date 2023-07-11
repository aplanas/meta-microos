SUMMARY = "Patch the inner source of python functions at runtime"
DESCRIPTION = "Patch the inner source of python functions at runtime."
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python310-patchy-2.6.0-1.5.noarch.rpm"
RPM_HASH = "8a95669ad87e79c3f080ea94760615122583145994ce35b86367ef5fcbf2568b4c8e6f16c33c00579a7c5bfb39c5e87f03509c7e42a7c963d0bdaa816175667d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-patchy \
python310-patchy \
python3dist-patchy"

RDEPENDS:${PN} += "python-abi \
python310-pkgutil-resolve-name"

inherit rpm
