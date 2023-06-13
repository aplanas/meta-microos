SUMMARY = "Run commands and manipulate files locally or over SSH"
DESCRIPTION = "Run commands and manipulate files locally or over SSH using the same interface"
LICENSE = "BSD-2-Clause"

PV = "0.3.22"

RPM_NAME = "python311-spur-0.3.22-1.4.noarch.rpm"
RPM_HASH = "77e955863e525e7e3da66bc9379936fa7ab920030b170c85d1d8b49ff49418c943b28a692e4f2e4c4e37994a19d01dd316a414b937d064909576131970a7c645"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(spur) \
python311-spur \
python3dist(spur)"

RDEPENDS:${PN} += "python(abi) \
python311-paramiko"

inherit rpm
