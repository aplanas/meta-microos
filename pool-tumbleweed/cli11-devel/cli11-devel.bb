SUMMARY = "Development files for CLI11"
DESCRIPTION = "CLI11 is a command line parser for C++11 and beyond that provides a \
rich feature set. It is header only, and has a number of design \
limits by choice: \
 \
 * No completion of partial options (like --ve for --version, \
   if it were unambiguous) \
 * No wide strings/Unicode"
LICENSE = "BSD-3-Clause"

PV = "2.3.2"

RPM_NAME = "cli11-devel-2.3.2-1.2.noarch.rpm"
RPM_HASH = "77df268cc19fe70c1c48a1d7873333eaa0dd481dac22922fe67d3c7ea88b70c776be5275a56db4a07751935561d59e8cdad7b38dab315695233c358b30f04e7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cli11-devel \
cmake(CLI11) \
pkgconfig(CLI11)"
RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
