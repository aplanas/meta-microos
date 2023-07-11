SUMMARY = "Architectural foundation for Python applications"
DESCRIPTION = "Wiring provides architectural foundation for Python applications, featuring: \
* dependency injection \
* interface definition and validation \
* modular component configuration \
* small, extremely pedantic codebase \
 \
Full documentation is available at http://wiring.readthedocs.org"
LICENSE = "Apache-2.0"

PV = "0.4.0"

RPM_NAME = "python311-wiring-0.4.0-2.18.noarch.rpm"
RPM_HASH = "2692087ffae270d54a0e6a302261f0dabe83442bcdc59270c537f41fb0485cfe865a59901e2146e3011025e8d27a6cccf8d10d502499234ed1902a8e5296abcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wiring \
python3.11dist-wiring \
python311-wiring \
python3dist-wiring"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
