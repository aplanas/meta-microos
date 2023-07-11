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

RPM_NAME = "nbdkit-1.32.2-1.4.aarch64.rpm"
RPM_HASH = "f8f51d590edbc3ac19347ef0011192583338d77a97704cf569d6713bf8009b91e46c8efa167eb4860c3a736231f9d03cef4ed93a4e48ce7b17aa11530cf186e7"

RPROVIDES:${PN} += "nbdkit"

RDEPENDS:${PN} += "nbdkit-basic-filters \
nbdkit-basic-plugins \
nbdkit-server"

inherit rpm
