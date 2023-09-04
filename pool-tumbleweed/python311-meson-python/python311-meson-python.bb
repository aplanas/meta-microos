SUMMARY = "Meson Python build backend (PEP 517)"
DESCRIPTION = "Python build backend (PEP 517) for Meson projects."
LICENSE = "MIT"

PV = "0.13.2"

RPM_NAME = "python311-meson-python-0.13.2-1.1.noarch.rpm"
RPM_HASH = "d7a8a3f2d88858f0312f19a3a0d13578421c1e6804012710910a50d9913621ab3715e23a7b8a99fff718c9a46e1e27bcaea3619334266c051c33e8d2a324b074"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-meson-python \
python3.11dist-meson-python \
python311-meson-python \
python3dist-meson-python"

RDEPENDS:${PN} += "meson \
python-abi \
python311-pyproject-metadata"

inherit rpm
