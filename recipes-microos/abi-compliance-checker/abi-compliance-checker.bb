SUMMARY = "A Compliance Checker For library ABIs"
DESCRIPTION = "ABI Compliance Checker (ACC) is an easy-to-use tool for checking \
backward binary compatibility (BC) of a shared C/C++ library. \
It checks header files along with shared libraries of old and new \
versions and analyzes changes in Application Binary Interface (ABI) \
that may cause compatibility problems: changes in calling stack, \
v-table changes, removed symbols, etc. Breakage of the binary \
compatibility may result in crashing or incorrect behavior of \
applications built with an old version of the library if they run on \
a new one. The tool is intended for library developers and operating \
system maintainers who are interested in ensuring binary \
compatibility, i.e. allow old applications to run with newer library \
versions without the need to recompile."
LICENSE = "LGPL-2.1-only"

PV = "2.3"

RPM_NAME = "abi-compliance-checker-2.3-3.10.noarch.rpm"
RPM_HASH = "0c3e79955376f945108fae4ecf83b3a66e51954b1a107fe3bd0ca1d11e1e6e596942ac1bf7b1c49e040396437bc2cf5ebec77978c54b112ae6be2a581ad3ba1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "abi-compliance-checker perl(In)"
RDEPENDS:${PN} += "/usr/bin/perl abi-dumper binutils coreutils cpio ctags diffutils file gcc-c++ gzip perl-base rpm tar"

inherit rpm
