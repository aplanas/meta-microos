SUMMARY = "Python3 bindings for sphinxbase"
DESCRIPTION = "Python3 bindings for sphinxbase-0.8 \
 \
CMU Sphinx toolkit is a speech recognition tool and has a number of packages for \
different tasks and applications."
LICENSE = "BSD-2-Clause & MIT"

PV = "0.8"

RPM_NAME = "python3-sphinxbase-0.8-6.7.aarch64.rpm"
RPM_HASH = "0c1361f696de73615d955a2428de6d6033253dbc24ec43a2cab1be69542658ddce7c7473730e8a8066a0bfc6cdc075999a260eacd5aefb29d6cb3bdbf6aa672b"

RPROVIDES:${PN} += "python3-sphinxbase \
python3.11dist-sphinxbase \
python3dist-sphinxbase"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsphinxbase.so.1 \
python-abi \
sphinxbase"

inherit rpm
