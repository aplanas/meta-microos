SUMMARY = "Documentation for python310-venusian"
DESCRIPTION = "This package contains documentation files for python310-venusian."
LICENSE = "SUSE-Repoze & ZPL-2.1"

PV = "3.0.0"

RPM_NAME = "python310-venusian-doc-3.0.0-4.2.noarch.rpm"
RPM_HASH = "86b5442883f3cbf002810136754d50d1b62d3b475bdd07fb326fa9b9862ebecd44f8329da2f397b66aa899cac1b2f8318454f5d5b42540c6d24e4265d92a443b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-venusian-doc"

RDEPENDS:${PN} += "python310-venusian"

inherit rpm
