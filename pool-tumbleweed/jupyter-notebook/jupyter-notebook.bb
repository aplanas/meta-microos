SUMMARY = "Jupyter Notebook interface"
DESCRIPTION = "The Jupyter HTML notebook is a web-based notebook environment for \
interactive computing. \
 \
This package provides the jupyter components."
LICENSE = "BSD-3-Clause"

PV = "7.0.2"

RPM_NAME = "jupyter-notebook-7.0.2-1.1.noarch.rpm"
RPM_HASH = "338c99dd008aac3662f19637e7fcb1f35a7e60422cb28e9a8f83f4a4087377d6c1aace2be928ff24cbcb57e4946fd25211702bb849233028c3d8231d69640edf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-notebook \
jupyter-notebook-doc"

RDEPENDS:${PN} += "python3dist-notebook"

inherit rpm
