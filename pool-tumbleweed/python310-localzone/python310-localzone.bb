SUMMARY = "A library for managing DNS zones"
DESCRIPTION = "A simple library for managing DNS zones."
LICENSE = "BSD-3-Clause"

PV = "0.9.8"

RPM_NAME = "python310-localzone-0.9.8-1.3.noarch.rpm"
RPM_HASH = "b88c072988ca495e02f09b07361c74e9011139a6d1506e6d6f4d29d702054bcb4d11239e573ac84729d081fb5367ec11f80b6bc31908678a4059e21d628c07e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-localzone \
python3.10dist(localzone) \
python310-localzone \
python3dist(localzone)"
RDEPENDS:${PN} += "python(abi) \
python310-dnspython"

inherit rpm
