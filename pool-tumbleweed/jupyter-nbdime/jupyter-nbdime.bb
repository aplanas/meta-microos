SUMMARY = "A JupyterLab extension for showing Notebook diffs"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides the tools and jupyter notebook extension."
LICENSE = "BSD-3-Clause"

PV = "6.2.0"

RPM_NAME = "jupyter-nbdime-6.2.0-12.3.noarch.rpm"
RPM_HASH = "93f9f21b66224b6fa5184213921347776add37b6d938455ea2074bac6f602dcbf1fd93cfb71d6680cd7c65f503d6adde78b0d5fdd4847588da159ab397e20698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbdime"

RDEPENDS:${PN} += "python3dist-nbdime"

inherit rpm
