SUMMARY = "Documentation for Argon2"
DESCRIPTION = "Documentation for Argon2, the password hashing function that won the Password \
Hashing Competition (PHC) in 2015."
LICENSE = "Apache-2.0 | CC0-1.0"

PV = "20190702"

RPM_NAME = "argon2-doc-20190702-2.6.noarch.rpm"
RPM_HASH = "78816d82791621380eec591b818c4e18d94d6ab04653fd8441db1f66e06d93177e91049da2b30f128816ad9e964e2f81b779bb534c3a922fe4feb9936b0cfd7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "argon2-doc"

RDEPENDS:${PN} += ""

inherit rpm
