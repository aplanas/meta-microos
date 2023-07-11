SUMMARY = "Patch the inner source of python functions at runtime"
DESCRIPTION = "Patch the inner source of python functions at runtime."
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python311-patchy-2.6.0-1.5.noarch.rpm"
RPM_HASH = "1c03b2f2818a1eece53f11221906a68168c4045d3f2cd64a43a26ce23ff925af2056752e1c253f7c0b016955508d86a429e538e05770ded41af961354181ef0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-patchy \
python3.11dist-patchy \
python311-patchy \
python3dist-patchy"

RDEPENDS:${PN} += "python-abi \
python311-pkgutil-resolve-name"

inherit rpm
