SUMMARY = "Matlab kernel for Jupyter"
DESCRIPTION = "A Matlab kernel for Jupyter. The Matlab kernel is based on \
MetaKernel, which means it features a standard set of magics."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.17.1"

RPM_NAME = "jupyter-matlab-kernel-0.17.1-1.3.noarch.rpm"
RPM_HASH = "6bc4c76e3586582640ac858af64e4ab189b126a3454552743517eb79537fd267ba46a38e6db896da56ea82db5e59942b2aea528a65a01424540b0e1a3a3dd387"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-matlab-kernel \
python3-jupyter-matlab-kernel \
python3-matlab-kernel \
python3.11dist-matlab-kernel \
python3dist-matlab-kernel"

RDEPENDS:${PN} += "python-abi \
python3-ipython \
python3-jupyter-client \
python3-metakernel"

inherit rpm
