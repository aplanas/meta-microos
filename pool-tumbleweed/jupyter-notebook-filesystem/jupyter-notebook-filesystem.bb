SUMMARY = "Common directories shared by Jupyter notebook packages"
DESCRIPTION = "This package provides common directories and macros used by many \
packages that depend on the Jupyter notebook. \
 \
It also provides macros for building packages that depend on \
the Jupyter notebook."
LICENSE = "BSD-3-Clause"

PV = "20221227"

RPM_NAME = "jupyter-notebook-filesystem-20221227-12.1.noarch.rpm"
RPM_HASH = "eb79a364f7c1422695215cf40c2352612538e1081f7c5bfff7b4a72cb7c2cdd50756d805d36f862e093c35b782f69c5c78a0369e3befadcc8e95f7c5648d62f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-notebook-filesystem \
jupyter-notebook-macros-devel \
python310-notebook-filesystem \
python310-notebook-macros-devel \
python311-notebook-filesystem \
python311-notebook-macros-devel \
python39-notebook-filesystem \
python39-notebook-macros-devel \
rpm-macro--jupyter-nb-auth-confdir \
rpm-macro--jupyter-nb-base-confdir \
rpm-macro--jupyter-nb-bidi-confdir \
rpm-macro--jupyter-nb-confdir \
rpm-macro--jupyter-nb-custom-confdir \
rpm-macro--jupyter-nb-edit-confdir \
rpm-macro--jupyter-nb-notebook-confdir \
rpm-macro--jupyter-nb-services-confdir \
rpm-macro--jupyter-nb-style-confdir \
rpm-macro--jupyter-nb-terminal-confdir \
rpm-macro--jupyter-nb-tree-confdir \
rpm-macro--jupyter-nbextension-confdir \
rpm-macro--jupyter-nbextension-dir \
rpm-macro--jupyter-server-confdir \
rpm-macro--jupyter-servextension-confdir \
rpm-macro-jupyter-nbextension-disable \
rpm-macro-jupyter-nbextension-enable \
rpm-macro-jupyter-nbextension-install \
rpm-macro-jupyter-serverextension-disable \
rpm-macro-jupyter-serverextension-enable"

RDEPENDS:${PN} += "jupyter-jupyter-core-filesystem \
python-rpm-macros"

inherit rpm
