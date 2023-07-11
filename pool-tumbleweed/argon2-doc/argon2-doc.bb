SUMMARY = "Documentation for Argon2"
DESCRIPTION = "Documentation for Argon2, the password hashing function that won the Password \
Hashing Competition (PHC) in 2015."
LICENSE = "Apache-2.0 | CC0-1.0"

PV = "20190702"

RPM_NAME = "argon2-doc-20190702-2.7.noarch.rpm"
RPM_HASH = "b808d19f5b17750cbd283edbf8b8e62375b948542f054a73085ed67ab78b925b7f30c03c5b9bb402046829f96d8ac0c48ca429ef8995d11877eab9ecdc1ab6e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "argon2-doc"

RDEPENDS:${PN} += ""

inherit rpm
