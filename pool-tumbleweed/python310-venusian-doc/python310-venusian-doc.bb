SUMMARY = "Documentation for python310-venusian"
DESCRIPTION = "This package contains documentation files for python310-venusian."
LICENSE = "SUSE-Repoze & ZPL-2.1"

PV = "3.0.0"

RPM_NAME = "python310-venusian-doc-3.0.0-3.1.noarch.rpm"
RPM_HASH = "89e9e34083b2302a98b345676f32b6e757c810fb4676abbe7a5e9904820e827fb1da4db79734f0cb59abb0140d77a99819bb3ef71c1a12885e517efb06e16ce0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-venusian-doc \
python310-venusian-doc"

RDEPENDS:${PN} += "python310-venusian"

inherit rpm
