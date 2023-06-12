SUMMARY = "Sphinx extension to include program output"
DESCRIPTION = "A Sphinx extension to literally insert the output of arbitrary commands into \
documents, helping you to keep your command examples up to date."
LICENSE = "BSD-2-Clause"

PV = "0.17"

RPM_NAME = "python311-sphinxcontrib-programoutput-0.17-2.8.noarch.rpm"
RPM_HASH = "54a2328dfd513f8e33f496e54b1b23f396652ed5d5d55d7e2adca6584c4fcaf5ca97457b3bdb95dc6d31240a0cca13e7a01fc21fc5068e77db3c620628ac3db4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinxcontrib-programoutput) \
python311-sphinxcontrib-programoutput \
python3dist(sphinxcontrib-programoutput)"
RDEPENDS:${PN} += "python(abi) \
python311-Sphinx"

inherit rpm
