SUMMARY = "Network Block Device server"
DESCRIPTION = "NBD is a protocol for accessing block devices (hard disks and \
disk-like things) over the network. \
 \
nbdkit is a toolkit for creating NBD servers. \
 \
The key features are: \
 \
* Multithreaded NBD server written in C. \
 \
* Minimal dependencies for the basic server. \
 \
* Documented plugin API with a stable ABI guarantee. \
  Lets you to export 'unconventional' block devices. \
 \
* You can write plugins in C or many other languages. \
 \
* Filters can be stacked in front of plugins to transform the output. \
 \
'nbdkit' is a meta-package which pulls in the core server and a \
subset of plugins and filters with minimal dependencies. \
 \
If you want just the server, install 'nbdkit-server'. \
 \
To develop plugins, install the 'nbdkit-devel' package and start by \
reading the nbdkit(1) and nbdkit-plugin(3) manual pages."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-1.32.2-1.3.aarch64.rpm"
RPM_HASH = "8fc0b7540b861a4e7cc00b356b579bb064c1c916895bf0ded07ada3a76504f123eac7ef087977ba58db0237dc89f0f18fcc04e3133b9d2d137e746654981568e"

RPROVIDES:${PN} += "nbdkit \
nbdkit(aarch-64)"

RDEPENDS:${PN} += "nbdkit-basic-filters \
nbdkit-basic-plugins \
nbdkit-server"

inherit rpm
