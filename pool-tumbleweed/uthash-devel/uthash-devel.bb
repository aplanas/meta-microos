SUMMARY = "Development headers for uthash"
DESCRIPTION = "This package provides development headers for uthash, a hash table \
implementation for C structures."
LICENSE = "BSD-3-Clause"

PV = "2.3.0"

RPM_NAME = "uthash-devel-2.3.0-1.7.noarch.rpm"
RPM_HASH = "4388a58442ae79e1cd08d14ca0df0299c82bca1fbda33529144985aa3560f55bbe17023eff994c6a34a3f7fca05f30d02231a0607981729ee157d6ba52ae94c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "uthash-devel"
RDEPENDS:${PN} += ""

inherit rpm
